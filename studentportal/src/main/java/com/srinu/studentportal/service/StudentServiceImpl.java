package com.srinu.studentportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.studentportal.model.Student;
import com.srinu.studentportal.repo.StudentRepo;

// How to do --> Business Logics
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student createStudent(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(Integer sid) {
//		return studentRepo.findById(sid).orElseThrow(()->new Exception());
		return studentRepo.findById(sid).get();

	}

	@Override
	public Student updateStudentById(Student s, Integer id) {

		Student studentInfofromdDb = getStudentById(id);

		studentInfofromdDb.setAge(s.getAge());
		studentInfofromdDb.setFname(s.getFname());
		studentInfofromdDb.setLname(s.getLname());
		studentInfofromdDb.setTotal_Marks(s.getTotal_Marks());

		return studentRepo.save(studentInfofromdDb);
	}

	@Override
	public void deleteStudentById(Integer sid) {
		studentRepo.deleteById(sid);
	}

	@Override
	public Student FindStudentByFname(String name) {
		return studentRepo.findByFname(name).get();
	}

}

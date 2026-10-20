package com.srinu.studentportal.service;

import java.util.List;

import com.srinu.studentportal.model.Student;

//what to do
public interface StudentService {

	public abstract Student createStudent(Student s);

	List<Student> getAllStudents();

	Student getStudentById(Integer sid) throws Exception;

	Student updateStudentById(Student s, Integer id);

	void deleteStudentById(Integer sid);

	Student FindStudentByFname(String name);
}

package com.srinu.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.studentportal.model.Student;
import com.srinu.studentportal.service.StudentService;

// endpoint of url interviwer---->
// http://localhost:9988/student
@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/wel")
	String Welcome() {
		return "welcome to most easiest concept in spring boot";
	}

	
	//http://localhost:9988/student/deleteById/16
	@DeleteMapping("/deleteById/{sid}")
	String deleteStudentById(@PathVariable Integer sid) {
		studentService.deleteStudentById(sid);
		return "Deleted " + sid + " successfully";
		
	}

//   http://localhost:9988/student/getAllStudents
	@GetMapping("/getAllStudents")
	List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	// http://localhost9988/student/getStudentById/1
	@GetMapping("/getStudentById/{sid}")
	Student getStudentById(@PathVariable Integer sid) throws Exception {
		return studentService.getStudentById(sid);
	}

	// http://localhost:9988/student/FindStudentByFname/aryan
	@GetMapping("/FindStudentByFname/{fname}")
	Student FindStudentByFname(@PathVariable String fname) {
		return studentService.FindStudentByFname(fname);
	}

	// http://localhost:9988/student/update/14
	@PutMapping("update/{sid}")
	Student updateStudentById(@RequestBody Student s, @PathVariable Integer sid) {
		return studentService.updateStudentById(s, sid);
	}

	//http://localhost:9988/student/sai
	@PostMapping("/sai")
	Student createStudent(@RequestBody Student s) {
		return studentService.createStudent(s);
	}
}

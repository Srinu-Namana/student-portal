package com.srinu.studentportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity // it is an entity which is going to create a table in your DB
@Table(name = "student73")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer sid;
	String fname;
	String lname;
	Integer age;
	Double total_Marks;
}

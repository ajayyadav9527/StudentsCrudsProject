package com.student.myproj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.myproj.entity.Students;
import com.student.myproj.repository.StudentRepository;

@RestController
public class StudentsController {
	@Autowired
	private StudentRepository studentRepository;

	@ResponseBody
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}

	@PostMapping("/savestudent")
	public Students saveData(@RequestBody Students student) {
		studentRepository.save(student);
		return student;
	}
	
	@GetMapping("/getstudent/{rollNo}")
	public Students getStudents(@PathVariable int rollNo) {
		Students student=studentRepository.findById(rollNo).get();
		
		return student;
	}

	@GetMapping("/getstudents")
	public List<Students> getStudents() {
		List<Students> students =studentRepository.findAll();
		return students;
	}
	
	@DeleteMapping("/deletestudents/{rollNo}")
	public Students deleteStudents(@PathVariable int rollNo) {
		Students student=studentRepository.findById(rollNo).get();
		if(student !=null) {
			studentRepository.delete(student);
		}
		
		return student;
	}
	
	@PutMapping("/updatestudents")
	public Students updateStudents(@RequestBody Students students) {
		studentRepository.save(students);
		return students;
	}
	
	
	
	

}

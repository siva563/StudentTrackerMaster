package com.savas.studenttracker.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.savas.studenttracker.model.Student;
import com.savas.studenttracker.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepository;

	@PostMapping("/saveStudent")

	public Student saveStudent(@RequestBody Student student) {

		return studentRepository.save(student);
	}

	@GetMapping("/getStudents")
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}

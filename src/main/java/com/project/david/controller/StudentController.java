package com.project.david.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.david.entity.Student;
import com.project.david.repository.StudentRepository;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RequestMapping("/api/student")
@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;

	@Operation(summary = "新增學生", description = "建立一筆學生資料")
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(@Valid @RequestBody Student student) {
		studentRepository.save(student);
		return ResponseEntity.ok("新增成功");
	}
}

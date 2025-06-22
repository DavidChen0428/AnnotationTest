package com.project.david.entity;

import com.project.david.vaild.Grade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Grade
	@Column(name = "MATH_GRADE")
	private Integer mathGrade;

	@Grade
	@Column(name = "CHINESE_GRADE")
	private Integer chineseGrade;

	@Grade
	@Column(name = "ENGLISH_GRADE")
	private Integer englishGrade;
}

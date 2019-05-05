package com.neuedu.dao;

import java.util.List;

import com.neuedu.entity.Student;

public interface StudentDao {

	void AddStudent(Student student);
	void DelStudent(String stuId);
	void UpdateStudent(Student student);
	List<Student> Query();
	Student getStudent(String stuId);
	List<String> getCourse(String stuId);
}

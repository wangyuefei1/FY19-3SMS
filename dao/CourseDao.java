package com.neuedu.dao;

import java.util.List;

import com.neuedu.entity.Course;

public interface CourseDao {

	void AddCourse(Course course);
	void DelCourse(String courseid);
	void UpdateStudent(Course course);
	List<String> getStudent(int courseId);
}

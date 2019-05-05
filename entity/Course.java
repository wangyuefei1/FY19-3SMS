package com.neuedu.entity;

import java.io.Serializable;

public class Course implements Serializable{

	private Integer CourseId;
	private String courseName;
	public Course()
	{
		
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", courseName=" + courseName + "]";
	}
	public Course(Integer courseId, String courseName) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
	}
	public Integer getCourseId() {
		return CourseId;
	}
	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}

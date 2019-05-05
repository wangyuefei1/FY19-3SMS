package com.neuedu.entity;

import java.io.Serializable;

public class Student implements Serializable{

	private String stuId;
	private String stuName;
	private Integer stuAge;
	private String stuSex;
	
	public Student()
	{
		
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public Student(String stuId, String stuName, Integer stuAge, String stuSex) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex + "]";
	}
}

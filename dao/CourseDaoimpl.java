package com.neuedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.entity.Course;

public class CourseDaoimpl implements CourseDao {

	private Connection connection;
	
	public  CourseDaoimpl(Connection connection)
	{
		this.connection=connection;
	}
	
	@Override
	public void AddCourse(Course course) {
		String sql = "INSERT INTO course VALUES (?,?) ";
		try (PreparedStatement ps =  connection.prepareStatement(sql);)
		{
			ps.setInt(1, course.getCourseId());
			ps.setString(2, course.getCourseName());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void DelCourse(String coursed) {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateStudent(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getStudent(int courseId) {
		List<String> student = new  ArrayList<String>();
		String sql = "SELECT stuName FROM studentcou JOIN student ON  studentcou.s_id = student.stuId WHERE c_id = ?";
		try(PreparedStatement ps = connection.prepareStatement(sql);)
		{
			ps.setInt(1, courseId);
			ResultSet  rs = ps.executeQuery();
			while (rs.next()) {
				String string = rs.getString("stuName");
				student.add(string);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

}

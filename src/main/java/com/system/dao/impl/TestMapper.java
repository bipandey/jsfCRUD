package com.system.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//import com.system.model.Faculty;
import com.system.model.Student;

public class TestMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student student =new Student();
	//Faculty faculty=new Faculty();
	
	student.setName(rs.getString("name"));
	student.setSex(rs.getString("sex"));
	student.setGrade(rs.getString("grade"));
	//faculty.setFaculty(rs.getString("faculty"));
	//student.getFaculty().setFaculty(rs.getString("faculty"));
	
	return student;
	}

}

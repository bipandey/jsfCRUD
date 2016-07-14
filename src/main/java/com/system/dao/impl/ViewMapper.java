package com.system.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.system.model.Faculty;
//import com.system.model.Faculty;
import com.system.model.Student;

public class ViewMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student student =new Student();
	Faculty faculty=new Faculty();
	
	student.setName(rs.getString("name"));
	student.setSex(rs.getString("sex"));
	student.setGrade(rs.getString("grade"));
	student.setS_id(rs.getInt("s_id"));
	faculty.setFaculty(rs.getString("faculty"));
	student.setFaculty(faculty);

	return student;
	}

}


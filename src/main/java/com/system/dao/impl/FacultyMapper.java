package com.system.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.system.model.Faculty;

public class FacultyMapper implements ParameterizedRowMapper<Faculty> {

	public Faculty mapRow(ResultSet rs, int rowNum) throws SQLException {

		Faculty faculty = new Faculty();
		faculty.setF_id(rs.getInt("f_id"));
		faculty.setFaculty(rs.getString("faculty"));
		return faculty;

	}
}

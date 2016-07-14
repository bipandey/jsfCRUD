package com.system.dao.interfac;

import java.sql.SQLException;
import java.util.Map;

import com.system.model.Student;

public interface StudentDaoImpl {
	
	public void addStudent(Student student);
	public Map<Integer,String> getFacultyDetails() throws SQLException;

	
}

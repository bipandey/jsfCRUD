package com.system.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.system.dao.impl.StudentDao;
import com.system.model.Faculty;
import com.system.model.Student;


@ManagedBean
public class StudentController {

	StudentDao studentDao = new StudentDao();
	

	@ManagedProperty(value = "#{student}")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@ManagedProperty(value = "#{faculty}")
	private Faculty faculty;

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Map<Integer, String> getFacultyDetail() throws SQLException {

		Map<Integer, String> facultyDetails = new HashMap<Integer, String>();
		facultyDetails = studentDao.getFacultyDetails();
		return facultyDetails;

	}

	public String addStudent() {

		studentDao.addStudent(student);

		return "view";
	}

	public List<Student> getStudentDetail(){
		
				
				return studentDao.getStudentDetail();
	}
	
	
	public String delete(int s_id){
		studentDao.deleteStudent(s_id);
		return "view";
	}
	
}

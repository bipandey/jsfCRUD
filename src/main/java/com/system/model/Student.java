package com.system.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
@ManagedBean
public class Student {
	
	private int s_id;
	private String name;
	//private Date dob;
	private String sex;
	private String grade;
	
	//private int f_id;
	@ManagedProperty(value="#{faculty}")
	private Faculty faculty;
	
	
	
	
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}*/
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/*public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	*/
	

}

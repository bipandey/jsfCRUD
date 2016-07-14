package com.system.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Faculty {

	private int f_id;
	private String faculty;
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
}

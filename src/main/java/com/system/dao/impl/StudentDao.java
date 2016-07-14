package com.system.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.system.model.Faculty;
import com.system.model.Student;

public class StudentDao extends JdbcConnectionPool {

	

	public void addStudent(Student student) {
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		String sql = "insert into student (name,sex,grade,f_id) values(:name,:sex,:grade,:f_id)";
		parameterSource.addValue("name", student.getName());
		parameterSource.addValue("sex", student.getSex());
		parameterSource.addValue("grade", student.getGrade());
		parameterSource.addValue("f_id", student.getFaculty().getF_id());

		getJdbcTemplate().update(sql, parameterSource);

	}

	public Map<Integer, String> getFacultyDetails() {
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		List<Map<String, Object>> row = new ArrayList<Map<String, Object>>();
		Map<Integer, String> facultyDetails = new HashMap<Integer, String>();
		String sql = "select *from faculty_detail";

		row = getJdbcTemplate().queryForList(sql, parameterSource);
		for (Map<String, Object> rows : row) {
			Faculty faculty = new Faculty();
			faculty.setF_id(Integer.parseInt(rows.get("f_id").toString()));
			faculty.setFaculty(rows.get("faculty").toString());
			facultyDetails.put(faculty.getF_id(), faculty.getFaculty());
		}
		return facultyDetails;
	}
	
	public List<Student> getStudentDetail(){
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		String sql="Select s.s_id,s.name, s.sex, s.grade, f.faculty from student s join faculty_detail f on s.f_id=f.f_id";
		List<Student> studentDetail=getJdbcTemplate().query(sql, parameterSource, new ViewMapper());
		return studentDetail;
	
	}
	
	public boolean deleteStudent(int s_id){
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		String sql="delete from student where s_id=:s_id";
		parameterSource.addValue("s_id", s_id);
		int i=getJdbcTemplate().update(sql, parameterSource);
		if(i>0){
			return true;
		}else{
			return false;
		}
	
	}
	
	
}

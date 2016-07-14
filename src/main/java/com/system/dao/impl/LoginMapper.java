package com.system.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.system.model.Login;

public class LoginMapper implements RowMapper<Login>{

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
		Login login=new Login();
		login.setUserId(rs.getString("userId"));
		login.setUserPassword(rs.getString("userPassword"));
		//login.setUserRole(rs.getString("userRole"));
		return login;
	}

	
}

package com.system.dao.impl;



import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.system.model.Login;



public class ValidateLogin  extends JdbcConnectionPool {

	public boolean validateLogin(Login login){
		String sql="select count(*) from login where userId=:userId and userPassword=:userPassword ";
		
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		parameterSource.addValue("userId", login.getUserId());
		parameterSource.addValue("userPassword", login.getUserPassword());
		int count = 0;
		
		count = getJdbcTemplate().queryForObject(sql, parameterSource, Integer.class);
	
		if (count == 0) {
		    System.out.println("No records found");
		}
	
		if(count>0){
			return true;
			
		}else{
			return false;
		}
		
	}
	
	/*public List<Login> getUserRole(){
		String sql=" SELECT userRole FROM login";
		List<Login> userRole=new ArrayList<Login>();
		Login login=new Login();
		//userRole=jdbcConnectionPool.getJdbcTemplate().queryForObject(sql, new Object[]{login.getUserRole()},String.class);
		userRole=jdbcConnectionPool.getJdbcTemplate().queryForList(sql, Login.class,new Object[]{login.getUserRole()} );
	
		return userRole;
		
	}*/

}

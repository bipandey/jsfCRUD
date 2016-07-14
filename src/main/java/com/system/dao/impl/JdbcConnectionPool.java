package com.system.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcConnectionPool {
	
	private static final String DB_URL = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=yes)(FAILOVER=ON)(ADDRESS=(PROTOCOL=TCP)(HOST=NVMNSDBD1.D2HAWKEYE.NET)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=d2he)))";
	private static final String PASS = "oracle";
	private static final String USER = "i82718";
	
public NamedParameterJdbcTemplate getJdbcTemplate() {

		DriverManagerDataSource datasource = new DriverManagerDataSource(

		DB_URL, USER, PASS);

		return new NamedParameterJdbcTemplate(datasource);

		}
	
	/*public JdbcTemplate getJdbcTemplate(){
		DriverManagerDataSource datasource = new DriverManagerDataSource(

				DB_URL, USER, PASS);
		
		return new JdbcTemplate(datasource);
	}*/


}

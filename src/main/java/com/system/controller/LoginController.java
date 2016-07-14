package com.system.controller;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.system.dao.impl.ValidateLogin;
import com.system.model.Login;
@ManagedBean
@RequestScoped
public class LoginController {
	@ManagedProperty(value="#{login}")
	private Login login;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	ValidateLogin validateLogin=new ValidateLogin();
	
	public String validate() throws SQLException{
		if(validateLogin.validateLogin(login)){
			return "welcome";
			
		}else{
			return "login";
			
			
		}
		
		
	}
	/*public List<Login> getUserRole(){
	
		List<Login> userRole=validateLogin.getUserRole();
		return userRole;
		
	}*/
	

}

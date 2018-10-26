package com.serviceI;

import org.springframework.ui.Model;

import com.model.Login;
import com.model.User;

public interface ServiceI 
{

	int saveUser(User user);

	User getSingleUser(Login login);

	void getDataForManagerLogin(Model model);



}

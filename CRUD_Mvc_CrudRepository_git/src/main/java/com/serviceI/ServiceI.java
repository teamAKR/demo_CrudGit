package com.serviceI;

import com.model.Login;
import com.model.User;

public interface ServiceI 
{

	int saveUser(User user);

	User getSingleUser(Login login);

}

package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.LoginDao;
import com.dao.UserDao;
import com.model.Login;
import com.model.User;
import com.serviceI.ServiceI;

public class ServiceImpl implements ServiceI{

	@Autowired
	UserDao userDao;
	@Autowired
	LoginDao loginDao;

	@Override
	public int saveUser(User user) {
		
		try{
			userDao.save(user);
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public User getSingleUser(Login login) {
		User user = new User();
		try{
		login=loginDao.findOneByUsernameAndPassword();
		}catch (Exception e) {
			// TODO: handle exception
			login.setLoginid(0);
			user.setLogin(login);
		}
		if(login.getLoginid()!=0){
			user=userDao.findOne(login);
		}
		
		return user;
	}
	
	

}

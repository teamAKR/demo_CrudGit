package com.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dao.LoginDao;
import com.dao.UserDao;
import com.model.Login;
import com.model.User;
import com.serviceI.ServiceI;

@Service
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
		login=loginDao.findOneByUsernameAndPassword(login.getUsername(),login.getPassword());
		}catch (Exception e) {
			System.out.println("hiii");
			login.setLoginid(0);
			user.setLogin(login);
		}
		if(login.getLoginid()!=0){
			user=userDao.findOneByLogin(login);
		}
		
		return user;
	}

	@Override
	public void getDataForManagerLogin( Model model) {
		
		List<User>allUserList=(List<User>) userDao.findAll();
		List<User>userList=new ArrayList<User>();
		for(User user:allUserList){
			if(user.getRole().getRoleid()==2){
				userList.add(user);
			}
		}
		model.addAttribute("userList", userList);
	}
	
	

}

package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;
import com.serviceI.ServiceI;
@Service
public class ServiceImpl implements ServiceI{
   @Autowired
   StudentDao dao;
   
	public StudentDao getDao() {
	return dao;
}

public void setDao(StudentDao dao) {
	this.dao = dao;
}

	@Override
	public Student SaveUser(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

}

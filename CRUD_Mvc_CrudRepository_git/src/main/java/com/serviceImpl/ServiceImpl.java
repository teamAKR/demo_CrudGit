package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;
import com.serviceI.ServiceI;
@Service
public class ServiceImpl implements ServiceI{
   @Autowired
   StudentDao dao;
   
	public StudentDao getDao() 
	{
	return dao;
	}

	public void setDao(StudentDao dao)
	{
	this.dao = dao;
	}

	@Override
	public Student SaveUser(Student student)
	{
		return dao.save(student);
	}

	@Override
	public Student check(Student student)
	{
		
		return dao.findAllByUnameAndPass(student.getUname(),student.getPass());
	}

	@Override
	public List<Student> getAllData(Student st)
	{
		
		return (List<Student>) dao.findAll();
	}

}

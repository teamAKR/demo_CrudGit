package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoI.DaoI;
import com.model.Student;
import com.serviceI.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	DaoI dao;
	
	public DaoI getDao() {
		return dao;
	}

	public void setDao(DaoI dao) {
		this.dao = dao;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public List<Student> login(Student student) {
		// TODO Auto-generated method stub
		
		Student s=dao.findAllByUnameAndPass(student.getUname(),student.getPass());
		
		if(s==null)
		{
		return null;
	
		}
		else {
			 	return (List<Student>)dao.findAll();
		}
	}

	@Override
	public Student getSingleStudent(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) dao.findAll();
	}

	@Override
	public void deleteStudent(int id)
	{
		// TODO Auto-generated method stub
		System.out.println(id);
		dao.delete(id);
		
	}
	
	
	
	
}

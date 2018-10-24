package com.daoI;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;



public interface DaoI extends CrudRepository<Student,Integer>
{

	Student findAllByUnameAndPass(String uname, String pass);
 
}

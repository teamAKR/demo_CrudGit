package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.model.Student;


public interface StudentDao extends CrudRepository<Student, Integer>
{

	Student findAllByUnameAndPass(String uname, String pass);

}

package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public interface StudentDao extends CrudRepository<Student, Integer>
{

}
package com.serviceI;

import java.util.List;

import com.model.Student;

public interface ServiceI 
{

	Student SaveUser(Student student);

	Student check(Student student);

	List<Student> getAllData(Student st);

}

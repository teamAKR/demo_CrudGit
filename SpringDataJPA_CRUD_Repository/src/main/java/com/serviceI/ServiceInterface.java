package com.serviceI;

import java.util.List;

import com.model.Student;

public interface ServiceInterface {

	Student saveStudent(Student student);

	List<Student> login(Student student);

	Student getSingleStudent(int id);

	Student updateStudent(Student student);

	List<Student> getAllStudent();

	void deleteStudent(int id);

}

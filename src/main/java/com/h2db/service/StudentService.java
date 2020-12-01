package com.h2db.service;

import java.util.List;

import com.h2db.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student getStudentById(int id);

	void delete(int id);

	void saveOrUpdate(Student student);

}

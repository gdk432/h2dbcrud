package com.h2db.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2db.entity.Student;
import com.h2db.service.StudentService;
import com.h2db.service.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override//getting all student records  
	public List<Student> getAllStudent() {
		
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll().forEach(student-> students.add(student));
		return students;
	}

	@Override//getting a specific record  
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		
		studentRepository.deleteById(id); 
	}

	@Override
	public void saveOrUpdate(Student student) {
		
		studentRepository.save(student);  
	}

	
}

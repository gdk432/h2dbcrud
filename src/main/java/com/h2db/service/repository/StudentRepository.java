package com.h2db.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h2db.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

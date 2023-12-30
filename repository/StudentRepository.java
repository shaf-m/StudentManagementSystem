package com.shafm.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shafm.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
	

}

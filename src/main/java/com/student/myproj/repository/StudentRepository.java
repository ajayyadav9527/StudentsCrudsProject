package com.student.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.myproj.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {
	
	public void deleteByrollNo(int rollNo);

}

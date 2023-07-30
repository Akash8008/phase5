package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
@Autowired
	StudentRepo repo;
	
	public Student insert(Student s) {
		return repo.save(s);
		
		
	}
	public List<Student> view(){
		return repo.findAll();
	}
	
}

package com.studentcrudoperation.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcrudoperation.studentcrud.domain.StudentDomain;
import com.studentcrudoperation.studentcrud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public List<StudentDomain> listAll(){
		return repo.findAll();
	}
	
	public void save(StudentDomain std) {
		repo.save(std);
	}
	
	public StudentDomain get(long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	

}

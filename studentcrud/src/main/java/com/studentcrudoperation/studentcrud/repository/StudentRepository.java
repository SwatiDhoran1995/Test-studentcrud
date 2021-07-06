package com.studentcrudoperation.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentcrudoperation.studentcrud.domain.StudentDomain;

@Repository
public interface StudentRepository extends JpaRepository<StudentDomain, Integer> {

}

package com.studentcrudoperation.studentcrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDomain {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String sname;
	private String course;
	private int fees;
	public StudentDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDomain(int id, String sName, String course, int fees) {
		super();
		this.id = id;
		this.sname = sName;
		this.course = course;
		this.fees = fees;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sname;
	}
	public void setsName(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	

}

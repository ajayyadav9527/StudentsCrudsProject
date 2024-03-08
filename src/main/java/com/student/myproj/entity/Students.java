package com.student.myproj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private int rollNo;
	private String name;
	private String mob;
	
	
	

	public Students() {

	}

	public Students(int rollNo, String name, String mob) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mob = mob;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", mob=" + mob + "]";
	}
	
	

}

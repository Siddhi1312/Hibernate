package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//while using JPA some annotations are mandatory
@SuppressWarnings("serial")
@Entity//used while creating class and employee is entity
@Table(name="employee")
public class Employee implements Serializable//serializable is an interface
{
	private static final long SerialVersionUID=1L;
	@Id//used for creating primary key
	private int ID;
	private String Name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}

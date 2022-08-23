package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity//used while creating class and employee is entity
@Table(name="college")

public class College {
	private static final long SerialVersionUID=1L;
	@Id
	private int Id;
	//private User collegeAdmin;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	public long getId() 
	{
		return Id;
	}
	public void setId(int id) 
	{
		Id = id;
	}
	
	public String getCollegeAdmin() 
	{
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) 
	{
		this.collegeAdmin = collegeAdmin;
	}
		

}

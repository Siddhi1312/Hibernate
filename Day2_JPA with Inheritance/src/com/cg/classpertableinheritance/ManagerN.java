package com.cg.classpertableinheritance;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.singleinheritance.Employee;


	@Entity
	@Table(name="MGR_Table1")
	
	public class ManagerN extends Employee 
	{
		private static final long serialVersionUID=1L;//for serializable
		private String deptName;
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		

}

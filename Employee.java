package com.myshopping.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//	 PK																			FK				
//  EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO

@Entity
@Table(name="SYS_EMP")
public class Employee {
	
	@Id
	@Column(name="EMPNO")
	private int employeeNumber;
	
	@Column(name="ENAME", length=10)
	private String employeeName;
	
	@Column(name="JOB", length=9)	
	private String employeeJob;
	
	@Column(name="MGR", length=4)
	private Integer employeeManager;
	
	@Column(name="HIREDATE" )
	private Date employeeHiredate;
	
	@Column(name="SAL")
	private double employeeSalary;
	
	@Column(name="COMM",nullable = true)
	private Double employeeCommission; //wrapper
	
	//foreign key column DEPTNO 
	//@JoinColumn(name="DEPTNO")
	
	@ManyToOne
	private Department dept; 
	
	
	public Employee() {
		super();
		System.out.println("Employee() Ctor");
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeJob() {
		return employeeJob;
	}

	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}

	public Integer getEmployeeManager() {
		return employeeManager;
	}

	public void setEmployeeManager(Integer employeeManager) {
		this.employeeManager = employeeManager;
	}

	public Date getEmployeeHiredate() {
		return employeeHiredate;
	}

	public void setEmployeeHiredate(Date employeeHiredate) {
		this.employeeHiredate = employeeHiredate;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Double getEmployeeCommission() {
		return employeeCommission;
	}

	public void setEmployeeCommission(Double employeeCommission) {
		this.employeeCommission = employeeCommission;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	
}

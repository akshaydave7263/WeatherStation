package com.dave.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainee")
public class Trainee implements Serializable{
	
	private static final long serialVersionUID = -723583058586873479L;
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "empid")
	 private Integer empId;
	 
	 @Column(name="empname")
	 private String empName;
	 
	 @Column(name="empaddress")
	 private String empAddress;
	 
	 @Column(name="password")
	 private String  password;
	 
	 @Column(name="empAge")
	 private Integer empAge;

	 public Integer getEmpId() {
	  return empId;
	 }

	 public void setEmpId(Integer empId) {
	  this.empId = empId;
	 }

	 public String getEmpName() {
	  return empName;
	 }

	 public void setEmpName(String empName) {
	  this.empName = empName;
	 }

	 public String getEmpAddress() {
	  return empAddress;
	 }

	 public void setEmpAddress(String empAddress) {
	  this.empAddress = empAddress;
	 }


	 public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEmpAge() {
	  return empAge;
	 }

	 public void setEmpAge(Integer empAge) {
	  this.empAge = empAge;
	 }

}

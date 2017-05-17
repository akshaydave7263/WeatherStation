package com.dave.bean;

import java.util.List;

import com.dave.bean.Trainee;

public interface TraineeDao {
	
	public void addEmployee(Trainee employee);

	 public List<Trainee> listEmployeess();
	 
	 public Trainee getEmployee(int empid);
	 
	 public void deleteEmployee(Trainee employee);

}

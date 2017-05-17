package com.dave.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dave.bean.TraineeDao;
import com.dave.bean.Trainee;

@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TraineeServiceImpl implements TraineeService {
	
	 @Autowired
	 private TraineeDao employeeDao;
	 
	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	 public void addEmployee(Trainee employee) {
	  employeeDao.addEmployee(employee);
	 }
	 
	 public List<Trainee> listEmployeess() {
	  return employeeDao.listEmployeess();
	 }

	 public Trainee getEmployee(int empid) {
	  return employeeDao.getEmployee(empid);
	 }
	 
	 public void deleteEmployee(Trainee employee) {
	  employeeDao.deleteEmployee(employee);
	 }
}

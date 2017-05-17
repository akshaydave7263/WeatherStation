package com.dave.bean;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dave.bean.Trainee;




@Repository("employeeDao")
public class TraineeDaoImpl implements TraineeDao {
	@Autowired
	 private SessionFactory sessionFactory;
	 
	 public void addEmployee(Trainee employee) {
	   sessionFactory.getCurrentSession().saveOrUpdate(employee);
	 }

	 @SuppressWarnings("unchecked")
	 public List<Trainee> listEmployeess() {
	  return (List<Trainee>) sessionFactory.getCurrentSession().createCriteria(Trainee.class).list();
	 }

	 public Trainee getEmployee(int empid) {
	  return (Trainee) sessionFactory.getCurrentSession().get(Trainee.class, empid);
	 }

	 public void deleteEmployee(Trainee employee) {
	  sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE empid = "+employee.getEmpId()).executeUpdate();
	 }

}

package com.jbk.SpringDao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class hibDao {
	@Autowired
SessionFactory sessionFactory;
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Employee> getallEmp(){
       Session session=sessionFactory.openSession();
       session.beginTransaction();
      Criteria criteria=session.createCriteria(Employee.class);
      List<Employee> emp_list=criteria.list();
       
return emp_list;
	}
	
	public Employee getemployeebyid(int eid) {
		Session session=sessionFactory.getCurrentSession();
		Employee emp=session.load(Employee.class, eid);
		return emp;
		
	}

	public void saveEmployee(Employee emp) {
		Session session=sessionFactory.getCurrentSession();
		session.save(emp);
		
	}
}

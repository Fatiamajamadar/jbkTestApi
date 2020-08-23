package com.jbk.SpringService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringDao.Employee;
import com.jbk.SpringDao.hibDao;

@Service
public class hibService {
	
	
@Autowired
hibDao hibdao;
	public List<Employee> getdata(){
		System.out.println("i am in service");
		 List<Employee> emplist=hibdao.getallEmp();
		return emplist;
	}
	public Employee getemployeebyid(int eid) {
		// TODO Auto-generated method stub
		Employee emp=hibdao.getemployeebyid(eid);
		
		return  emp;
	}
	public void saveEmployee(Employee emp) {
		hibdao.saveEmployee( emp);
		
	}
}

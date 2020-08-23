package com.jbk.springController;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.jbk.SpringDao.Employee;
import com.jbk.SpringService.hibService;

@RestController
@RequestMapping("/api/")
public class hibController {

	@Autowired
	hibService hibservice;
	
	@Autowired
	SessionFactory  sessionFactory;
	@GetMapping("show")
	public List<Employee> showall(){
		 List<Employee> Emplist=hibservice.getdata();
		return Emplist;
	}
	@GetMapping("getallemployeebyid/{eid}")
	public Employee getemployeebyid(@PathVariable int eid)
	{
		Employee emp=hibservice.getemployeebyid(eid);
		return emp;
	}
//	@PostMapping("addemp")
//	public String empadd(@RequestBody Employee emp) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
//		Employee empadd=new Employee();
//		empadd.setEid(emp.getEid());
//		empadd.setEname(emp.getEname());
//		empadd.setDepartment(emp.getDepartment());
//		empadd.setStatus(emp.getPhoneno());
//		empadd.setPhoneno(emp.getPhoneno());
//		
//		Session session=sessionFactory.openSession();
//		Transaction transaction= (Transaction) session.beginTransaction();
//		session.save(emp);
//		transaction.commit();
//		
//		return"employee added successfully";
//	}
	@PostMapping(value="/saveemp", headers="Accept=application/json")
	public ResponseEntity<Void> save(@RequestBody Employee emp,UriComponentsBuilder uriBuilder)
	{
		hibservice.saveEmployee(emp);
		HttpHeaders headers=new HttpHeaders();
		headers.setLocation(uriBuilder.path("/emp/{eid}").buildAndExpand(emp.getEid()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
		
	}
}
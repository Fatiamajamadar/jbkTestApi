// package com.jbk;
//
//import java.sql.Array;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin
//@RestController
//@RequestMapping("/api/")
//public class controller {
//@RequestMapping("jbk")
//	public String m1() {
//		return"hello fatima";
//	}
//@RequestMapping("jbk1")
//public String[]  hobbylist() {
//	String[] al=new String[3] ;
//			al[0]= "painting";
//			al[1]="reading";
//			al[2]="cooking";
//			return al;
//}
//@RequestMapping("jbk2")
//public ArrayList<String>  list() {
//	ArrayList<String> al=new ArrayList<String>() ;
//		 al.add("painting");
//		 al.add("reading");
//		 al.add("gardning");
//			return al;
//}
//
// @GetMapping("showemp") public ArrayList<Employee1> Addlist(){
//	 ArrayList<Employee1>  al=new ArrayList<Employee1>(); 
//	 Employee1 add=new Employee1(); 
//	 System.out.println("i m in showemp");
//	 add.setAge(25);
//  add.setName("karan");
//  add.setCity("pune");
//  add.setPincode(415409);
//  al.add(add); 
//  return al;
//  
//  }  
//  @GetMapping("jbk4/{name}") public ArrayList<Employee1>
//  Addlistname(@PathVariable String name){ ArrayList<Employee1> al=new
//  ArrayList<Employee1>(); if("jbk".equals(name)) {
//	  Employee1 add=new Employee1();
//  add.setAge(25); add.setName("karan"); add.setCity("pune");
//  add.setPincode(415409); al.add(add); } if("javabykiran".equals(name)) {
//  Employee1 add1=new Employee1(); add1.setAge(25); add1.setName("pooja");
//  add1.setCity("pune"); add1.setPincode(415409); al.add(add1); } return al; }
//  
//  @PostMapping("addemp")
//  public String addEmp(@RequestBody Employee1 add) throws Exception{
//System.out.println(add); 
//  return "employee added";
//  }
//
//}

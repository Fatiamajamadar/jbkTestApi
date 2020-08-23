//package com.jbk.springController;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jbk.SpringDao.Employee;
//import com.jbk.SpringService.SpringService;
//
//@RestController
//@RequestMapping("/api/")
//public class SpringController {
//	
//
//	@Autowired
//	SpringService SpringService;
//	@SuppressWarnings("rawtypes")
//	@GetMapping("/showallemp")
//	public ArrayList showall() throws SQLException {
//		return SpringService.passdata();
//	}
//	@GetMapping(value="id/{eid}")
//	public ArrayList showallid(@PathVariable int eid) throws SQLException {
//		return SpringService.passiddata(eid);
//	}
//	@GetMapping(value="showstatus/{status}")
//	public ArrayList showallid(@PathVariable String status) throws SQLException {
//		return SpringService.showstatus(status);
//	}
//	@PostMapping("addemp")
//	public String add(@RequestBody Employee emp ) throws SQLException{
//		String ename;String department;String phoneno;
//		ArrayList add=new ArrayList();
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(2);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springhibernate", "root", "root");
//			System.out.println(1);
//			java.sql.Statement stmt = conn.createStatement();
//			String sql = "insert into employee where value(1,karan,act,ry,579)";
//			 stmt.executeUpdate(sql);
//			 
//					} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "added";
//		
//	}
//}

//package com.jbk.SpringDao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.RequestBody;
//@Repository
//public class SpringDao {
//	
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public ArrayList getAll() throws SQLException{
//		int eid;String ename; String status;String department;String phoneno;
//		ArrayList add=new ArrayList();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(2);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springhibernate", "root", "root");
//			System.out.println(1);
//			java.sql.Statement stmt = conn.createStatement();
//			String sql = "SELECT * FROM employee" ;
//			ResultSet rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				 eid=rs.getInt(1);
//				 ename=rs.getString(2);
//				 status=rs.getString(3);
//				 department=rs.getString(4);
//				 phoneno=rs.getString(5);
//				 
//
//add.add(eid);
//add.add(ename);
//add.add(status);
//add.add(department);
//add.add(phoneno);
//
// 
//				
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return add;
//		
//	}
//	@SuppressWarnings("unchecked")
//	public ArrayList getAllid(int eid) throws SQLException{
//		String ename; String status;String department;String phoneno;
//		ArrayList add=new ArrayList();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(2);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springhibernate", "root", "root");
//			System.out.println(1);
//			java.sql.Statement stmt = conn.createStatement();
//			String sql = "SELECT * FROM employee where eid=1" ;
//			ResultSet rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				 eid=rs.getInt(1);
//				 ename=rs.getString(2);
//				 status=rs.getString(3);
//				 department=rs.getString(4);
//				 phoneno=rs.getString(5);
//				 
//
//add.add(eid);
//add.add(ename);
//add.add(status);
//add.add(department);
//add.add(phoneno);
//
// 
//				
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return add;
//		
//	}
//
//
//	public ArrayList getstatus(String status) throws SQLException{
//		String ename;String department;String phoneno;
//		ArrayList add=new ArrayList();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(2);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springhibernate", "root", "root");
//			System.out.println(1);
//			java.sql.Statement stmt = conn.createStatement();
//			String sql = "SELECT * FROM employee where status='"+status+"'" ;
//			ResultSet rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				int eid=rs.getInt(1);
//				 ename=rs.getString(2);
//				 status=rs.getString(3);
//				 department=rs.getString(4);
//				 phoneno=rs.getString(5);
//				 
//
//add.add(eid);
//add.add(ename);
//add.add(status);
//add.add(department);
//add.add(phoneno);
//
// 
//				
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return add;
//		
//	}
//	
//	
//}

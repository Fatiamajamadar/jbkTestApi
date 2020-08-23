//package com.jbk;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jbk.bean.Employee1;
//import com.mysql.jdbc.Statement;
//
//@RestController
//public class EmpController {
//
//	@SuppressWarnings("rawtypes")
//	/*
//	 * @GetMapping("showall") public ArrayList showall() throws SQLException { int
//	 * id; String name; String phoneno; String status; String createdby; String
//	 * createddtm; String updatedby;String updateddtm;int cid; ArrayList addall =
//	 * new ArrayList(); try { Class.forName("com.mysql.jdbc.Driver");
//	 * System.out.println(2); Connection conn =
//	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root",
//	 * "root"); System.out.println(1); java.sql.Statement stmt =
//	 * conn.createStatement(); String sql = "SELECT * FROM employee "; ResultSet rs
//	 * = stmt.execut eQuery(sql); while (rs.next()) { id = rs.getInt("id"); name =
//	 * rs.getString("name"); // department = rs.getString("department"); status =
//	 * rs.getString("status"); createddtm = rs.getString("createddtm"); createdby =
//	 * rs.getString("createdby"); updateddtm = rs.getString("updateddtm"); updatedby
//	 * = rs.getString("updatedby"); cid = rs.getInt("cid"); addall.add(id);
//	 * addall.add(name); //addall.add(department); addall.add(status);
//	 * addall.add(createddtm); addall.add(createdby); addall.add(updateddtm);
//	 * addall.add(updatedby); addall.add(cid);
//	 * 
//	 * 
//	 * }
//	 * 
//	 * 
//	 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
//	 * e.printStackTrace(); } return addall;
//	 * 
//	 * }
//	 */
//	/*
//	 * @GetMapping(value="showstatus/{status}") public ArrayList
//	 * showActive(@PathVariable String status) throws SQLException {
//	 * 
//	 * ArrayList addall = new ArrayList(); try { int id; String name; String
//	 * phoneno; String createdby; String createddtm; String updatedby;String
//	 * updateddtm;int cid; Class.forName("com.mysql.jdbc.Driver");
//	 * System.out.println(2); Connection conn =
//	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root",
//	 * "root"); System.out.println(1); java.sql.Statement stmt =
//	 * conn.createStatement(); String sql = "SELECT * FROM employee where status='"+
//	 * status +"'"; ResultSet rs = stmt.executeQuery(sql); while (rs.next()) { id =
//	 * rs.getInt("id"); name = rs.getString("name"); status =
//	 * rs.getString("status"); createddtm = rs.getString("createddtm"); createdby =
//	 * rs.getString("createdby"); updateddtm = rs.getString("updateddtm"); updatedby
//	 * = rs.getString("updatedby"); cid = rs.getInt("cid"); addall.add(id);
//	 * addall.add(name); //addall.add(department); addall.add(status);
//	 * addall.add(createddtm); addall.add(createdby); addall.add(updateddtm);
//	 * addall.add(updatedby); addall.add(cid); } } catch (ClassNotFoundException e)
//	 * { // TODO Auto-generated catch block e.printStackTrace(); } return addall;
//	 * 
//	 * }
//	 */
//
//	/*
//	 * @GetMapping(value="showint/{id}") public ArrayList showId(@PathVariable int
//	 * id) throws SQLException {
//	 * 
//	 * ArrayList addall = new ArrayList(); try { String name; String phoneno; String
//	 * status; String createdby; String createddtm; String updatedby;String
//	 * updateddtm;int cid; Class.forName("com.mysql.jdbc.Driver");
//	 * System.out.println(2); Connection conn =
//	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root",
//	 * "root"); System.out.println(1); java.sql.Statement stmt =
//	 * conn.createStatement(); String sql = "SELECT * FROM employee where id=1 ";
//	 * ResultSet rs = stmt.executeQuery(sql); while (rs.next()) { id=
//	 * rs.getInt("id"); name = rs.getString("name"); // department =
//	 * rs.getString("department"); status = rs.getString("status"); createddtm =
//	 * rs.getString("createddtm"); createdby = rs.getString("createdby"); updateddtm
//	 * = rs.getString("updateddtm"); updatedby = rs.getString("updatedby"); cid =
//	 * rs.getInt("cid"); addall.add(id); addall.add(name); //addall.add(department);
//	 * addall.add(status); addall.add(createddtm); addall.add(createdby);
//	 * addall.add(updateddtm); addall.add(updatedby); addall.add(cid);
//	 * 
//	 * 
//	 * }
//	 * 
//	 * 
//	 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
//	 * e.printStackTrace(); } return addall;
//	 * 
//	 * }
//	 */
//
//	/*
//	 * @GetMapping(value="showname/{name}") public ArrayList
//	 * showActive(@PathVariable String name) throws SQLException {
//	 * 
//	 * ArrayList addall = new ArrayList(); try { int id; String phoneno; String
//	 * createdby; String createddtm; String updatedby;String updateddtm;int cid;
//	 * Class.forName("com.mysql.jdbc.Driver"); System.out.println(2); Connection
//	 * conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database",
//	 * "root", "root"); System.out.println(1); java.sql.Statement stmt =
//	 * conn.createStatement(); String sql = "SELECT * FROM employee where 
//	 * name='"+
//	 * name +"'"; ResultSet rs = stmt.executeQuery(sql); while (rs.next()) { id =
//	 * rs.getInt("id"); name = rs.getString("name"); String status =
//	 * rs.getString("status"); createddtm = rs.getString("createddtm"); createdby =
//	 * rs.getString("createdby"); updateddtm = rs.getString("updateddtm"); updatedby
//	 * = rs.getString("updatedby"); cid = rs.getInt("cid"); addall.add(id);
//	 * addall.add(name); //addall.add(department); addall.add(status);
//	 * addall.add(createddtm); addall.add(createdby); addall.add(updateddtm);
//	 * addall.add(updatedby); addall.add(cid); } } catch (ClassNotFoundException e)
//	 * { // TODO Auto-generated catch block e.printStackTrace(); } return addall;
//	 * 
//	 * }
//	 */
//	@GetMapping(value = "showname/{name}")
//	public ArrayList showname(@PathVariable String name) throws SQLException {
//
//		ArrayList<Employee1> addall = new ArrayList<Employee1>();
//		Employee1 emp = new Employee1();
//		try {
//			int id;
//		
//			String phoneno;
//			String createdby;
//			String createddtm;
//			String updatedby;
//			String updateddtm;
//			int cid;
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(2);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
//			System.out.println(1);
//			java.sql.Statement stmt = conn.createStatement();
//			String sql = "SELECT * FROM employee where name='"+name+"'" ;
//			ResultSet rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				id = rs.getInt("id");
//				name = rs.getString("name");
//				String status = rs.getString("status");
//				createddtm = rs.getString("createddtm");
//				createdby = rs.getString("createdby");
//				updateddtm = rs.getString("updateddtm");
//				updatedby = rs.getString("updatedby");
//				cid = rs.getInt("cid");
//				emp.setid(id);
//				emp.setname(name);
//				emp.setstatus(status);
//				emp.setcreatedby(createdby);
//				emp.setcreateddtm(createddtm);
//				emp.setupdatedby(updatedby);
//				emp.setupdateddtm(updateddtm);
//				emp.setcid(cid);
//				addall.add(emp);
//				
//			}
//		} catch (ClassNotFoundException e) { // TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return addall;
//
//	}
//	/*
//	 * @GetMapping(value = "showdaybefore/{status}") public ArrayList
//	 * showActive(@PathVariable String status) throws SQLException {
//	 * 
//	 * ArrayList<Employee> addall = new ArrayList<Employee>(); Employee emp = new
//	 * Employee(); try { int id; String name; String phoneno; String createdby;
//	 * String createddtm; String updatedby; String updateddtm; int cid;
//	 * Class.forName("com.mysql.jdbc.Driver"); System.out.println(2); Connection
//	 * conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database",
//	 * "root", "root"); System.out.println(1); java.sql.Statement stmt =
//	 * conn.createStatement(); String sql =
//	 * "SELECT * FROM employee where createddtm< current_timestamp()"; ResultSet rs
//	 * = stmt.executeQuery(sql); while (rs.next()) { id = rs.getInt("id"); name =
//	 * rs.getString("name"); status = rs.getString("status"); createddtm =
//	 * rs.getString("createddtm"); createdby = rs.getString("createdby"); updateddtm
//	 * = rs.getString("updateddtm"); updatedby = rs.getString("updatedby"); cid =
//	 * rs.getInt("cid"); emp.setid(id); emp.setname(name); emp.setstatus(status);
//	 * emp.setcreatedby(createdby); emp.setcreateddtm(createddtm);
//	 * emp.setupdatedby(updatedby); emp.setupdateddtm(updateddtm); emp.setcid(cid);
//	 * addall.add(emp);
//	 * 
//	 * } } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
//	 * e.printStackTrace(); } return addall;
//	 * 
//	 * }
//	 */
//
//	@PostMapping(value = "empadd")
//	public String addempl(@RequestBody Employee1 employee ) throws Exception {
//		System.out.println(employee);
//		ArrayList<Employee1> addall = new ArrayList<>();
//	 
//		try {
//			
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(2);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
//			System.out.println(1);
//			java.sql.Statement stmt = conn.createStatement();
//			String sql = "insert into employee(id,name,status,createddtm,createdby,updateddtm,updatedby,cid) values("
//					+ employee.getid() + "," + employee.getname() + "," + employee.getstatus() + "," + employee.getcreatedby() + ","
//					+ employee.getcreateddtm() + "," + employee.getupdatedby() + "," + employee.getupdateddtm() + "," + employee.getcid()
//					+ ")";
//			int aa = stmt.executeUpdate(sql);
//			System.out.println(aa);
//		} catch (SQLException e) { // TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "added successfully";

	//}
//}
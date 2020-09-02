package com.servlet.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
private int usn;
private String name;
private String classes;
private int m1;
private int m2;
private int m3;
private int m4;
private int m5;
private Connection con;
private PreparedStatement pstmt;

public int getUsn() {
	return usn;
}
public void setUsn(int usn) {
	this.usn = usn;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getClasses() {
	return classes;
}
public void setClasses(String classes) {
	this.classes = classes;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}
public int getM4() {
	return m4;
}
public void setM4(int m4) {
	this.m4 = m4;
}
public int getM5() {
	return m5;
}
public void setM5(int m5) {
	this.m5 = m5;
}

public Model() {
	try { System.out.println("Try To Connect DB");
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","12345678");
	System.out.println("Driver loaded and connection is established");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
public boolean insert() throws SQLException {
	String sql="insert into table1 values(?,?,?,?,?,?,?,?,?)";
	pstmt=con.prepareStatement(sql);
	pstmt.setInt(1,usn);
	pstmt.setString(2,name);
	pstmt.setString(3,classes);
	pstmt.setInt(4,m1);
	pstmt.setInt(5,m2);
	pstmt.setInt(6,m3);
	pstmt.setInt(7,m4);
	pstmt.setInt(8,m5);
	int percentage=(((m1+m2+m3+m4+m5)/50)*100);
	pstmt.setInt(9,percentage);
	
	int x=pstmt.executeUpdate();
	System.out.println("Excute Update Run sucessfully");
	if(x>0) {
		return true;
	}
	return false;
}
}

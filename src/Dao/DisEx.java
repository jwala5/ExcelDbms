package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import utility.ConnectionManager;

//function for displaying Excel Sheet
public class DisEx {
	public void getAllStudent(){
		try {
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM students");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}
		
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}}

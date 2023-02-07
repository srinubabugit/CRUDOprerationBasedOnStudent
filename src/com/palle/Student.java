package com.palle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Student 
{
	private static final String url ="jdbc:mysql://localhost:3306/palle";
	private static Connection con = null;
	private static Statement  s= null;
    private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	

	
		

	
	public void creating()
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,"root","srinu");
			
			s=con.createStatement();
			
			s.executeUpdate("create table student(sid int primary key auto_increment,sname varchar(30),"
					+ "sub varchar(40),email varchar(70))");
			
			
			
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				if(s!=null)
				{
				s.close();
			} 
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			}
			
		
		
		
	}
	public void inserting(String name,String subject,String email)
	
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,"root","srinu");
			
			ps=con.prepareStatement("insert into student(sname,sub,email) values (?,?,?)");
			
			ps.setString(1,name);
			ps.setString(2, subject);
			ps.setString(3, email);
			
			ps.executeUpdate();
			
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				if(ps!=null)
				{
				ps.close();
			} 
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			}
			
			
			
		}
		
		
	
 public void updating(int sno, String subject,String email)
	
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,"root","srinu");
			
			ps=con.prepareStatement("update student set sub=?,email=? where sid=?");
			
			ps.setInt(3,sno);
			ps.setString(1, subject);
			ps.setString(2, email);
			
			ps.executeUpdate();
			
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				if(ps!=null)
				{
				ps.close();
			} 
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
				}
			
			
			
		

   public void deleting(int d)
	
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,"root","srinu");
			
			ps=con.prepareStatement("delete from student  where sid =?");
			
			ps.setInt(1,d);
			
			
			ps.executeUpdate();
			
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				if(ps!=null)
				{
				ps.close();
			} 
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		}
   public void Read ()
	
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,"root","srinu");
			
			s=con.createStatement();
			rs=s.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("sid"));
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("sub"));
				System.out.println(rs.getString("email"));
				
							}
				
			
						
			
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				if(ps!=null)
				{
				ps.close();
			} 
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			}
			
			}
   
   public ArrayList<B>  Reading ()
	
	
 	{
	   ArrayList<B> al=new ArrayList<>();
	   
	   
	   
 		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			
 			con=DriverManager.getConnection(url,"root","srinu");
 			
 			s=con.createStatement();
 			rs=s.executeQuery("select * from student");
 			
 			while(rs.next())
 			{
 				int i = rs.getInt("sid");
 				String n  = rs.getString("sname");
 				String s = rs.getString("sub");
 				String e  = rs.getString("email");
 				
 				B b = new B(i, s, n, e);
 				al.add(b);
 			}
 			
 				
 							
 				
 			
 						
 			
 			
 		}
 		catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 		finally 
 		{
 			try {
 				if(ps!=null)
 				{
 				ps.close();
 			} 
 				if(con!=null)
 				{
 					con.close();
 				}
 			}catch (SQLException e) {
 				
 				e.printStackTrace();
 			}
 			}
		return al;
   

	
}

			
}			
		
		
	

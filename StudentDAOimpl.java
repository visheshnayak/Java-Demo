package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
	
	public StudentDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		
		Connection connection = MyConnection.setConnection();
		System.out.println("Connected");
		String sql = "INSERT INTO student VALUES(?,?,?,?)";
		int rows=0;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
		
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getTotal_marks());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyConnection.closeConnection();
		
		
		return rows;
	}

	@Override
	public Student updateStudent(int rollno, String address) {
		// TODO Auto-generated method stub
		
		Connection connection = MyConnection.setConnection();
		System.out.println("Connected");
		String sql = "UPDATE student SET address=? WHERE rollno=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
		
			ps.setString(1, address);
			ps.setInt(2, rollno);
					
			int rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyConnection.closeConnection();
		
		return findByRollno(rollno);
	}

	@Override
	public int deleteStudent(int rollno) {
		// TODO Auto-generated method stub
		
		Connection connection = MyConnection.setConnection();
		String sql = "DELETE FROM student WHERE rollno=?";
		int rows=0;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
		
			ps.setInt(1, rollno);		
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyConnection.closeConnection();
		
		return rows;
	}

	@Override
	public Student findByRollno(int rollno) {
		// TODO Auto-generated method stub
		
		Connection conn = MyConnection.setConnection();
		String sql = "SELECT * FROM student WHERE rollno=?";
		Student res = new Student();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, rollno);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				res.setRollno(rs.getInt(1));
				res.setName(rs.getString(2));
				res.setAddress(rs.getString(3));
				res.setTotal_marks(rs.getInt(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyConnection.closeConnection();
		
		return res;
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		
		Connection conn = MyConnection.setConnection();
		String sql = "SELECT * FROM student WHERE name=?";
		List<Student> res = new ArrayList<Student>();
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Student temp = new Student();
				temp.setRollno(rs.getInt(1));
				temp.setName(rs.getString(2));
				temp.setAddress(rs.getString(3));
				temp.setTotal_marks(rs.getInt(4));
				res.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyConnection.closeConnection();
		
		return res;
	}

	@Override
	public List<Student> findByAddress(String address) {
		// TODO Auto-generated method stub
		
		Connection conn = MyConnection.setConnection();
		String sql = "SELECT * FROM student WHERE address=?";
		List<Student> res = new ArrayList<Student>();
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, address);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Student temp = new Student();
				temp.setRollno(rs.getInt(1));
				temp.setName(rs.getString(2));
				temp.setAddress(rs.getString(3));
				temp.setTotal_marks(rs.getInt(4));
				res.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyConnection.closeConnection();
		
		return res;
	}

}


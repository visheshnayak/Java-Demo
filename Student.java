package com.project;

public class Student {
	private String name;
	private String address;
	private int rollno;
	private int total_marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public Student(String name, String address, int rollno, int total_marks) {
		super();
		this.name = name;
		this.address = address;
		this.rollno = rollno;
		this.total_marks = total_marks;
	}
	public Student()
	{
		name = "na";
		address = "na";
		rollno = 0;
		total_marks = 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.rollno+" "+this.name+" "+this.address+" "+this.total_marks;
	}
	

}

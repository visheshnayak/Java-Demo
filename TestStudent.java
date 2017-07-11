package com.project;

import java.util.List;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDAOImpl sd = new StudentDAOImpl();
		
		System.out.println("WELCOME TO NSE IT");
		System.out.println("Please Enter your choice: ");
		System.out.println("1. Add");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. Find by roll number");
		System.out.println("5. Find by address");
		System.out.println("6. Find by name");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Student stud = new Student();
			System.out.println("Enter the values (roll, name, address, total marks): ");
			stud.setRollno(sc.nextInt());
			stud.setName(sc.next());
			stud.setAddress(sc.next());
			stud.setTotal_marks(sc.nextInt());
			
			sd.addStudent(stud);
			
			break;
		
		case 2:
			System.out.println("Enter the roll of the student and new address(roll, address): ");
			int roll = sc.nextInt();
			String address = sc.next();
			
			sd.updateStudent(roll, address);
			
			break;
			
		case 3:
			System.out.println("Enter the roll of the student to be deleted: ");
			int roll2 = sc.nextInt();
			
			sd.deleteStudent(roll2);
			
			break;
			
		case 4:
			System.out.println("Enter the roll number: ");
			int roll3 = sc.nextInt();
			
			Student res = sd.findByRollno(roll3);
			System.out.println(res);
			
			break;
			
		case 5:
			System.out.println("Enter the address: ");
			String address2 = sc.next();
			
			List<Student> reslist = sd.findByAddress(address2);
			System.out.println(reslist);
			
			break;
			
		case 6:
			System.out.println("Enter the name: ");
			String name2 = sc.next();
			
			List<Student> reslist2 = sd.findByName(name2);
			System.out.println(reslist2);
			
			break;
			
		}
		

	}

}

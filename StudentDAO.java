package com.project;

import java.util.List;

public interface StudentDAO {
	int addStudent(Student student);
	Student updateStudent(int rollno, String address);
	int deleteStudent(int rollno);
	Student findByRollno(int rollno);
	List<Student> findByName(String name);
	List<Student> findByAddress(String address);

}


package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentServiceImpl service = new StudentServiceImpl();
		
		// Create Operation
		
		student.setStudentid(101);
		student.setName("Virat");
		service.addStudent(student);
		
		
		// Retrieve Operation
		service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		
		
	/*	// Update Operation
		student  =service.findStudentById(101);
		student.setName("Virat Kohli");
		service.updateStudent(student);*/
		
		
	/*	service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());*/
		
		
		// Delete Operation
		/*student=service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("Row removed");*/
		
		
	}

}

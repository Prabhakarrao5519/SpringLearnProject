package com.example.GalgotiasApp;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.GalgotiasApp.prabhakar.Student;
import com.example.GalgotiasApp.prabhakar.springBootConfig;

public class GalgotiasAppApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springBootConfig.class);
	
		Student student = (Student) context.getBean("student1");
		System.out.println(student);
		System.out.println("RollNumber :"+student.getId());
		System.out.println("Student Name "+student.getName());
		System.out.println("Total marks "+student.getMarks());
		
	
	
		context.close(); // optional, but good practice
	}
	

}

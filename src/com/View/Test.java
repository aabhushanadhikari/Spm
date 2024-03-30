package com.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.Student;
import com.Service.Service;
import com.Service.ServiceIMPL;

public class Test {
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		char flag='y';
		Service se=new ServiceIMPL();
		
		do{
		Student s=new Student();
		System.out.println("Enter the roll number of the student");
		s.setRoll_no(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the name of the student");
		s.setName(sc.nextLine());
		System.out.println("Enter the location of the student");
		s.setLocation(sc.nextLine());
		System.out.println("Enter the subject of the student");
		s.setSubject(sc.nextLine());
		se.addStudents(s);;
		System.out.println("Do you want to add more students[y/n]");
		flag=sc.nextLine().charAt(0);
	}while(flag=='y');
		List<Student> getAll=se.getAllStudents();
		for(Student stu:getAll) {
			System.out.println("The name of student is "+stu.getName());
			System.out.println("The location of the student is "+stu.getLocation());
			System.out.println("The subject of the student is "+stu.getSubject());
			System.out.println("The roll number of the student is "+stu.getRoll_no());
		}
		System.out.println("Enter the index of the student that you want to delete?");
		int index=Integer.parseInt(sc.nextLine());
		se.deleteStudents(index);
		List<Student> getAllStu=se.getAllStudents();
		for(Student stu2:getAllStu) {
			System.out.println("The name of student is "+stu2.getName());
			System.out.println("The location of the student is "+stu2.getLocation());
			System.out.println("The subject of the student is "+stu2.getSubject());
			System.out.println("The roll number of the student is "+stu2.getRoll_no());
		}
		
	}
}

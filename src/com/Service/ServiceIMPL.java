package com.Service;

import java.util.ArrayList;
import java.util.List;

import com.Model.Student;

public class ServiceIMPL implements Service{
	static List<Student> stu=new ArrayList<>();
	@Override
	public void addStudents(Student s) {
		stu.add(s);
		System.out.println("Student added.The size is "+stu.size());
		
	}

	@Override
	public void deleteStudents(int index) {
		stu.remove(index);
		System.out.println("Student removed");
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return stu;
	}
	

}

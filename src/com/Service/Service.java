package com.Service;

import java.util.List;

import com.Model.Student;

public interface Service {
	public void addStudents(Student s);
	public void deleteStudents(int index);
	List<Student> getAllStudents();
}

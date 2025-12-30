package edu.institute.studentmanagement.app.service;

import java.util.List;

import edu.institute.studentmanagement.app.model.Student;

public interface Student_Interface {

	
	public void saveStudent(Student st);
	public List<Student> getAllStudents();
	
	
	
}

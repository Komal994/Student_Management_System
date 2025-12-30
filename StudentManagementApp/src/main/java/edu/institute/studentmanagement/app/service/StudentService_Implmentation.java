package edu.institute.studentmanagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.institute.studentmanagement.app.model.Student;
import edu.institute.studentmanagement.app.repositary.StudentRepositary;

@Service
public class StudentService_Implmentation implements Student_Interface {
	
	@Autowired
	private StudentRepositary sr;
	
	public void saveStudent(Student st) {
		
		sr.save(st);
	}
	
	public List<Student> getAllStudents()
	{
		List<Student> all_students=sr.findAll();
		return  all_students;
	}
}

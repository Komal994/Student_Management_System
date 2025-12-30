package edu.institute.studentmanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.institute.studentmanagement.app.model.Student;
import edu.institute.studentmanagement.app.service.StudentService_Implmentation;

@Controller
public class AdminController {
	
	@Autowired
	StudentService_Implmentation si;
	
	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String onLogin(@RequestParam String username ,@RequestParam String password,Model m) {
		
		if(username.equals("admin") && password.equals("admin123"))
		{
			List<Student> all_student =si.getAllStudents();
			m.addAttribute("data", all_student);
		return "adminscreen";
		}
		else
		{
			m.addAttribute("login_fail", "Enter valid login details");
			return "login";
		}
	}
	
	@RequestMapping("enroll_student")
	public String  saveStudent(@ModelAttribute Student st,Model m) {
		si.saveStudent(st);
		List<Student> all_student =si.getAllStudents();
		m.addAttribute("data", all_student);
		return "adminscreen";
	}
	
	@RequestMapping("/search")
	public String getBatchStudent(@RequestParam String batchNumber ,Model m) {
		
		
		return "adminscreen";
				
	}
	
	

}

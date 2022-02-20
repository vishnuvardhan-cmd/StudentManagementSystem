package com.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.entity.Student;
import com.management.service.StudentService;

@Controller
public class StudentController {

	private StudentService ss;

	public StudentController(StudentService ss) {
		super();
		this.ss = ss;
	}
	
	//handler method to handle list of student and return model and view
	
	@GetMapping("/students")
	public String listOfStudents(Model model)
	{
		model.addAttribute("students",ss.getAllStudents());
		return "students";//ss.getAllStudents();
	}
	
	@GetMapping("/students/new")
	public String NewStudent(Model model)
	{
		Student s=new Student();
		model.addAttribute("student",s);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String SaveStudent(@ModelAttribute("student") Student student)
	{
		ss.save(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String FindStudent(Model model,@PathVariable("id") Long id)
	{
		Student s=ss.getStudent(id);
		model.addAttribute("student",s);
		return "update_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable("id") Long id,@ModelAttribute("student") Student student)
	{
		//finding the existing student by id
		Student exist=ss.getStudent(id);
		exist.setFirstName(student.getFirstName());
		exist.setLastName(student.getLastName());
		exist.setEmail(student.getEmail());
		ss.save(exist);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/{id}")
	public String Delete(@PathVariable("id") Long id,@ModelAttribute("student") Student student)
	{
		//Student stdelete=ss.getStudent(id);
		ss.Delete(student);
		return "redirect:/students";
		
	}
}

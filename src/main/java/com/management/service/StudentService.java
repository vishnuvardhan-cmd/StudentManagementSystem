package com.management.service;

import java.util.List;

import com.management.entity.Student;

public interface StudentService {

	public void save(Student s);
	public List<Student> getAllStudents();
	public Student getStudent(Long id);
	Student updateStudent(Student s);
	public void Delete(Student student);
}

package com.management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.entity.Student;
import com.management.repository.StudentRepository;
import com.management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	private StudentRepository sr;
	//whenever the spring bean has only one constructor we need not use the @Autowired annotation
	//the spring will automatically gives object
	public StudentServiceImpl(StudentRepository sr) {
		super();
		this.sr = sr;
	}

	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		Student s=sr.findById((long) id).get();
		return s;
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		
		return sr.save(s);
	}

	@Override
	public void Delete(Student student) {
		// TODO Auto-generated method stub
		sr.delete(student);
	}
	
	

}

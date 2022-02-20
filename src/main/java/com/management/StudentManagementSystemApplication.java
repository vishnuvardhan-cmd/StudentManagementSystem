package com.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.management.entity.Student;
import com.management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository sr;
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Student s=new Student("Vishnuvardhan","Bandlamudi","bvishnu123vardhan@gmail.com");
//		sr.save(s);
//		Student s1=new Student("ravi","Keshavapudi","ravikeshavpudhi@gmail.com");
//		sr.save(s1);
//		Student s2=new Student("Sahithi","Tadikonda","sahithitadikonda@gmail.com");
//		sr.save(s2);
//		Student s3=new Student("sahithi","Kavali","sahithikavali @gmail.com");
////		sr.save(s3);
	}
	
	

}

package com.management.demo;

import com.management.demo.Model.Student;
import com.management.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception{

//		Student student1 = new Student("Ramesh","Fedatre","ramesh@gmail.com","0839793565");
//		studentRepository.save(student1);
//		Student student2 = new Student("khomotso","Maincanye","khomotso@gmail.com","0789793565");
//		studentRepository.save(student2);
//		Student student3 = new Student("Jame","Neels","james@gmail.com","0864522578");
//		studentRepository.save(student3);
//		Student student4 = new Student("Thabang","Rakgoropo","thabangrak@gmail.com","0672192144");
//		studentRepository.save(student4);


	}

}

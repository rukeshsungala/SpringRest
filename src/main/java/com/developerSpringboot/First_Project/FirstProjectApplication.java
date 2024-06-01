package com.developerSpringboot.First_Project;

import com.developerSpringboot.First_Project.dao.StudentDAO;
import com.developerSpringboot.First_Project.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*@SpringBootApplication(
		scanBasePackages = {"com.developerSpringboot.First_Project.common",
							"com.developerSpringboot.First_Project..util"}

)*/
@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		//create multiple students
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("Rukesh", "sungala","rs@gamil.com");
		Student tempStudent2 = new Student("LakshmiReddy", "sungala","ls@gamil.com");
		Student tempStudent3 = new Student("Umavathi", "sungala","us@gamil.com");


		//save the student object
		System.out.println("Saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//display id of the saved student
		//System.out.println("Saved student. Generated id: "+ tempStudent1.getId());

	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student Object

		System.out.println("Creating new student object...");
		//Student tempStudent = new Student("Rukesh", "Reddy","rrr@gamil.com");
		Student tempStudent1 = new Student("Lakshmi", "Reddy","lr@gamil.com");
		//save the student object

		System.out.println("Saving the student");
		//studentDAO.save(tempStudent);
		studentDAO.save(tempStudent1);
		//display id of the saved student
		System.out.println("Saved student. Generated id: "+ tempStudent1.getId());
	}

}

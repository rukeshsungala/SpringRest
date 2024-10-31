package com.developerSpringboot.First_Project;

import com.developerSpringboot.First_Project.dao.StudentDAO;
import com.developerSpringboot.First_Project.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudents(studentDAO);

		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: "+numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 4;
		System.out.println("Deleting student id: "+studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		int studentId =1;
		System.out.println("Getting student with id: "+studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student...");
		myStudent.setFirstName("rukesh");
		studentDAO.update(myStudent);

		System.out.println("Updated student: "+myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("reddy");
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create  a student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");

		// save the student
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);
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

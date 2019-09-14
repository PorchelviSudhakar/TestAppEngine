package com.test.first;

import java.util.Arrays;
import java.util.List;



public class StudentRepository {
	List<Student> studentList;

	public StudentRepository() {
		Student student = new Student();
		student.setName("student1");
		student.setMark(80);
		student.setId(1);

		Student student1 = new Student();
		student1.setName("student2");
		student1.setMark(90);
		student1.setId(2);
		studentList = Arrays.asList(student, student1);
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public Student getStudent(int id) {
		
		for (Student student : studentList) {
			if(student.getId()==id) {
				return student;
			}
		}
		return new Student();
	}
}
package com.test.first;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("student")
public class StudentResources {
	

	StudentRepository studentrepo = new StudentRepository();
	
	
	//This method returns the list of students in JSON Format
	@GET
	@Path("getStudentList")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Student> getStudentInformation() {
		// Fetching data like from the database
		return studentrepo.getStudentList();
	}
	
	
	// This method takes student bean in JSON Format and returns the student which matches with the given id
	@POST
	@Path("getStudentWithId")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Student getId(Student student) {
		//This method returns a student that matches with the particular id
		return studentrepo.getStudent(student.getId());
	}
}

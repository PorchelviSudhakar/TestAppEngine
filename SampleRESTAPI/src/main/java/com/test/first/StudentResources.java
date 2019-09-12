package com.test.first;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("student")
public class StudentResources {
	

	StudentRepository studentrepo = new StudentRepository();
	
	@GET
	@Path("getStudentList")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Student> getStudentInformation() {
		// Fetching data like from the database
		System.out.println("getStudentInformation========================");
		return studentrepo.getStudentList();
	}
	
	@POST
	@Path("getStudentWithId")
	public Student getId(Student student) {
		//This method returns a student that matches with the particular id
		System.out.println("getId--------------------------------------------------");
		return studentrepo.getStudent(student.getId());
	}
}

package com.test.first;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;

@Path("student")
public class StudentResources {

	
	//Included Dependency Injection
	@Inject
	StudentRepository studentrepo;

	// This method returns the list of students in JSON Format
	@GET
	@Path("getStudentList")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Student> getStudentList() {
		// Fetching data like from the database
		
		return studentrepo.getStudentList();
	}

	// This method takes student bean in JSON Format and returns the student which
	// matches with the given id
	@POST
	@Path("getStudentWithId")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Student getStudentWithId(Student student) {
		// This method returns a student that matches with the particular id
		return studentrepo.getStudent(student.getId());
	}
	
	@POST
	@Path("saveStudentInfo")
	public void saveStudentInfo(Student student) {
//		ObjectifyService.init();
//		ofy().save().entity(new Student(student.getId(),student.getName(),student.getMark())).now();
	}
}

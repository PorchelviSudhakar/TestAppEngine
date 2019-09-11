package com.porchelvi.PickerProject;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import projects.Projects;

public class SerialPickerTest {
	
private List<Projects> serialPickerlist = new ArrayList();
private String desiredProject = "Project 2";
	
	
	
	@Before
    public void NormalTest()
    {
		serialPickerlist.add(new Projects("Project 1"));
		serialPickerlist.add(new Projects("Project 2"));
		serialPickerlist.add(new Projects("Project 3"));
    }
	
	@Test
	public void getSerialObjectTest() {
		Object expected=null;
		for (Projects project : serialPickerlist) {
			if (desiredProject.contains(project.getName())) {
				System.out.println("Retrieved Project Using SerialPicker is : " + project.getName());
				expected =  project.getName();
			}
		}
		Object actual = SerialPicker.getSerialObject(serialPickerlist,desiredProject);
		assertEquals(expected, actual);
	}

}

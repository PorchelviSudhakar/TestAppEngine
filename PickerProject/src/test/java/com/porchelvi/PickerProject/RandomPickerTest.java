package com.porchelvi.PickerProject;


import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.porchelvi.PickerProject.RandomPicker;

import projects.Projects;


public class RandomPickerTest {
	
	private List<Projects> randomPickerlist = new ArrayList();
	
	
	
	@Before
    public void NormalTest()
    {
		randomPickerlist.add(new Projects("Project1"));
		randomPickerlist.add(new Projects("Project2"));
		randomPickerlist.add(new Projects("Project3"));
    }
	
	@Test
	public void getRandomObjectTest() {
		Random rand=new Random();
		int randomIndex = rand.nextInt(randomPickerlist.size());
		Object Expected = randomPickerlist.get(randomIndex).getName();
		Object Actual = RandomPicker.getRandomObject(randomPickerlist);
		System.out.println("=========Expected============="+Expected);
		System.out.println("=========Actual============="+Actual);
		assertEquals(Actual, Expected);
	}

}

package com.porchelvi.PickerProject;

import java.util.List;
import java.util.Random;

import projects.Projects;

public class RandomPicker {

	List<Projects> randomPickerlist;
	private Object obj;

	/*
	 * RandomPicker Constructor Input:List<Projects>
	 */
	public RandomPicker(List<Projects> randomPickerlist) {
		this.randomPickerlist = randomPickerlist;
		obj = getRandomObject(randomPickerlist);

		if (obj != null || !obj.equals("null")) {
			System.out.println("Retrieved Project Using Random Picker is " + obj);
		} else {
			System.out.println("Searched Project Not Found ");
		}
	}

	/* getRandomObject method returns the random object in the list */
	public static Object getRandomObject(List<Projects> randomPickerlist) {
		Random rand = new Random();
		int randomIndex = rand.nextInt(randomPickerlist.size());
		return randomPickerlist.get(randomIndex).getName();
	}
}

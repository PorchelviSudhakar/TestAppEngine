package com.porchelvi.PickerProject;

import java.util.List;
import java.util.Random;

import projects.Projects;

public class RandomPicker {

	List<Projects> randomPickerlist;

	public RandomPicker(List<Projects> randomPickerlist) {
		this.randomPickerlist = randomPickerlist;
		Object obj = getRandomObject(randomPickerlist);

		if (obj != null || !obj.equals("null")) {
			System.out.println("Retrieved Project Using Random Picker is " + obj);
		} else {
			System.out.println("Searched Project Not Found ");
		}
	}

	public static Object getRandomObject(List<Projects> randomPickerlist) {
		Random rand = new Random();
		int randomIndex = rand.nextInt(randomPickerlist.size());
		return randomPickerlist.get(randomIndex).getName();
	}
}

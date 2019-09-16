package com.porchelvi.PickerProject;

import java.util.List;

import projects.Projects;

public class SerialPicker {
	private List<Projects> serialPickerlist;
	private static int count = 0;

	/*
	 * SerialPicker Constructor Input:List<Projects>
	 */
	SerialPicker(List<Projects> SerialPickerlist) {
		this.serialPickerlist = SerialPickerlist;
		getSerialObject(serialPickerlist);
	}

	/*
	 * getSerialObject method takes given list as input and prints the next element
	 * in the List
	 */
	public static void getSerialObject(List<Projects> serialPickerlist) {
		for (int temp = 0; temp <= serialPickerlist.size() - 1; temp++) {
			if (count == serialPickerlist.size() - 1) {
				temp = 0;
				System.out.println("Retrieved Project Using SerialPicker is : " + serialPickerlist.get(temp).getName());
				break;
				// Recursive call leads to stack overflow
				// getSerialObject(serialPickerlist, desiredProject);
			}
			System.out.println("Retrieved Project Using SerialPicker is : " + serialPickerlist.get(temp + 1).getName());
			count++;
		}

	}

}

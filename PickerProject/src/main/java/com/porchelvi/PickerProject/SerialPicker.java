package com.porchelvi.PickerProject;

import java.util.List;

import projects.Projects;

public class SerialPicker {
	private List<Projects> serialPickerlist;
	private static int count = 0;

	SerialPicker(List<Projects> SerialPickerlist, String desiredProject) {
		this.serialPickerlist = SerialPickerlist;
		Object serialObject = getSerialObject(serialPickerlist, desiredProject);
		System.out.println("Retrieved Project Using SerialPicker is : " + serialObject);
	}

	public static Object getSerialObject(List<Projects> serialPickerlist, String desiredProject) {
		for (Projects project : serialPickerlist) {
			count++;

			if (desiredProject.equals(project.getName())) {
				if (count == serialPickerlist.size()) {
					getSerialObject(serialPickerlist, desiredProject);
				}
				return project.getName();
			} else {
				System.out.println("Searched Project Not Found " + project.getName());
			}

		}
		return null;
	}

}

package com.porchelvi.PickerProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projects.Projects;

/**
 * This class takes the provided input and based on the selection of picker it
 * will navigate to that logic
 *
 */
public class PickerMain {
	static List<Projects> list = new ArrayList<Projects>();

	public static void main(String[] args) {

		// Instead of getting input from client side , input were got by scanner

		// Input to create list of objects
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Projects to add into the list ");
		String[] nk = scan.nextLine().split(" ");
		System.out.println("Added Projects Are: ");
		for (String string : nk) {
			list.add(new Projects(string));
			System.out.println(string);
		}

		// Input For the Picker Selection
		Scanner pickerScanner = new Scanner(System.in);
		System.out.println("please press A for SerialPicker or B For RandomPicker");
		String picker = pickerScanner.nextLine();

		if (picker.equals("A")) {
			new SerialPicker(list);
		} else {
			new RandomPicker(list);
		}
		scan.close();
		pickerScanner.close();

	}
}

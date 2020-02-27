package com.yash.view;

import java.util.Scanner;

import com.yash.Entity.Interns;
import com.yash.Entity.Level;
import com.yash.controller.InternController;

public class UpdateView {
	public static void updateView(Scanner sc) {
		Boolean flag = true;
		try {
			while (flag) {
				System.out.println(" intern update view");
				System.out.println("please give intern id");
				int interId = sc.nextInt();
				Interns updateIntern=InternController.getInstance().getInternById(interId);
				System.out.println("please give intern first name");
				String internFirstname = sc.next();
				System.out.println("please give intern last name");
				String internLastname = sc.next();
				System.out.println("please give intern age");
				int internAge = sc.nextInt();
				System.out.println("please give intern last semester marks");
				double marks = sc.nextDouble();
				Level internLevel;
				if (marks >= 75) {
					internLevel = Level.ADVANCED;
				} else if (marks >= 60 && marks < 75) {
					internLevel = Level.INTERMEDIATE;
				} else {
					internLevel = Level.BEGINNER;
				}
				updateIntern.setInternFirstName(internFirstname);
				updateIntern.setInternLastName(internLastname);
				updateIntern.setInternAge(internAge);
				updateIntern.setLevel(internLevel);
				InternController.getInstance().updateIntern(updateIntern);
				boolean flag2=true;
				while (flag2) {
					System.out.println("1.update another intern");
					System.out.println("2.main menu");
					int option = sc.nextInt();
					switch (option) {
					case 1:{
						flag = true;
						flag2 = false;
						break;
					}
					case 2: {
						flag = false;
						flag2 = false;
						
						break;
					}
					default: {
						System.out.println("choose proper option");
						break;
					}
					}
				}
			}
		}finally {
			
		}
	}
}

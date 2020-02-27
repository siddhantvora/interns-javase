package com.yash.view;

import java.util.Scanner;



import com.yash.Entity.Interns;
import com.yash.Entity.Level;
import com.yash.controller.InternController;

public class InsertView {

	public static void insertView(Scanner sc) {
		Boolean flag = true;
		try {
			while (flag) {
				System.out.println("new intern add view");
				System.out.println("please give intern id");
				int interId = sc.nextInt();
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
				Interns intern = new Interns();
				intern.setId(interId);
				intern.setInternFirstName(internFirstname);
				intern.setInternLastName(internLastname);
				intern.setInternAge(internAge);
				intern.setLevel(internLevel);
				InternController.getInstance().addIntern(intern);
				boolean flag2=true;
				while (flag2) {
					System.out.println("1.add new intern");
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

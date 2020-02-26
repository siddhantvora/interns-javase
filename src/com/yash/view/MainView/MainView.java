package com.yash.view.MainView;

import java.util.Scanner;

import com.yash.controller.InternController;

public class MainView {
	public void mainMenu() {

		Boolean flag = true;
		InternController controller=new InternController();
		try (Scanner sc = new Scanner(System.in)){
		while (flag) {
			System.out.println("welecom to main menu");
			System.out.println("1.add new Intern");
			System.out.println("2.get all intern details");
			System.out.println("0.Exit");
			System.out.println("Choose option:");
			 
				int option = sc.nextInt();
				switch (option) {
				case 0:
					flag=false;
					break;
				case 1:
					System.out.println("inserted");
					break;
				case 2:
					System.out.println("got all interns");
					break;

				default:
					System.out.println("choose proper option");
					break;
				}
			}
		}
	}
}

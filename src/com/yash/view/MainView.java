package com.yash.view;

import java.util.Scanner;

import com.yash.controller.InternController;

public class MainView {
	public void mainMenu() {

		Boolean flag = true;
		InternController controller= InternController.getInstance();
		try (Scanner sc = new Scanner(System.in)){
		while (flag) {
			System.out.println("welecom to main menu");
			System.out.println("1.add new Intern");
			System.out.println("2.get all intern details");
			System.out.println("3.update intern details");
			System.out.println("4.delete intern details");
			System.out.println("0.Exit");
			System.out.println("Choose option:");
			 
				int option = sc.nextInt();
				switch (option) {
				case 0:
					flag=false;
					break;
				case 1:
					
					InsertView.insertView(sc);
					
					break;
				case 2:
					
					System.out.println(controller.getAllInterns());
					System.out.println("press enter");
					sc.nextLine();
					break;
				case 3:
					
					UpdateView.updateView(sc);
					
					break;
				case 4:
					
					DeleteView.deleteView(sc);
					System.out.println("press enter");
					sc.nextLine();
					break;
				
				default:
					System.out.println("choose proper option");
					break;
				}
			}
		}
	}
}

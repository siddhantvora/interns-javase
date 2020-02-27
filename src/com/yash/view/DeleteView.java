package com.yash.view;

import java.util.Scanner;

import com.yash.Entity.Interns;
import com.yash.Entity.Level;
import com.yash.controller.InternController;

public class DeleteView {
	public static void deleteView(Scanner sc) {
		Boolean flag = true;
		try {
			while (flag) {
				System.out.println(" intern update view");
				System.out.println("please give intern id");
				int interId = sc.nextInt();
				Interns deleteIntern=InternController.getInstance().getInternById(interId);
				System.out.println("1.enter 1 for deleting ");
				System.out.println("2.enter other value for cancel");
				int o=sc.nextInt();
				if(o==1) {
				InternController.getInstance().deleteIntern(deleteIntern);
				}
				boolean flag2=true;
				while (flag2) {
					System.out.println("1.delete another intern");
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

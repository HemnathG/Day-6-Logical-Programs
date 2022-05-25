package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userchoice;
		long startTime = 0;
		long stopTime;
		long timeElapsed;

		while (true) {

			System.out.println("Choose 1-START , 2-STOP , 3-EXIT");
			userchoice = scanner.nextInt();
			switch (userchoice) {
			case 1:
				startTime = System.currentTimeMillis()/1000;
				System.out.println(+ startTime + " sec");
				break;

			case 2:
				stopTime = System.currentTimeMillis()/1000;
				System.out.println(+ stopTime + " sec");
				timeElapsed = stopTime - startTime;
				System.out.println("Elapsed Time: " + timeElapsed + " sec");
				break;

			case 3:
				System.out.println("Exiting the StopWatch...!!!");
				System.exit(0);
			}
		
		}
	}

}

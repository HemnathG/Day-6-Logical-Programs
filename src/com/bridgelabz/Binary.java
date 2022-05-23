package com.bridgelabz;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Enter a Numbers which needs to be changed to Binary");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int[] binaryArray = new int[32];

		int i = 0;
		while (number > 0) {
			binaryArray[i] = number % 2;
			number = number / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryArray[j]);
		}
	}
}

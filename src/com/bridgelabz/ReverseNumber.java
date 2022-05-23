package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		System.out.print("The Number is:" + num);

		int reversed = 0;

		while (num != 0) {

			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);

	}

}

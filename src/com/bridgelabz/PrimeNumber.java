package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();

		for (int i = 2; i <= num / 2; i++) {

			if ((num % i) == 0) {
				System.out.println("The Number is not a prime number");
				break;
			} else {
				System.out.println("The Number is a prime number");
				break;
			}
		}

	}

}

package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1 = scanner.nextInt();
		int Sum = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == num1) {
			System.out.format("The Number is a Perfect Number");
		} else {
			System.out.format("The Number is NOT a Perfect Number");
		}
	}
}

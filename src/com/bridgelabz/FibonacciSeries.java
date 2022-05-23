package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Count");
		int count = scanner.nextInt();

		int n1 = 0;
		int n2 = 1;
		int n3;

		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.print(n3 + " ");
		}
	}
}

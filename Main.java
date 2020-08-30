package com.javaaj.moduleTwo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int pickVal = 0;
		System.out.println("Enter a number: "); //enter greater than 1 value
		int num = scanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not prime");
				pickVal = 1;
				break;
			}
			} if(pickVal == 0)
				System.out.println(num + " is prime");
	}
}
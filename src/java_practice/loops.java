package java_practice;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		int n;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		/*
		 * Tables for (int i = 1; i <= 10; i++) { System.out.println(n + "x" + i + "=" +
		 * (n * i)); }
		 */
		/*
		 * for (int i = 0; i <= n; i++) { sum += i; System.out.println("Sum is:" + sum);
		 * } System.out.println(sum);
		 */
		if (n < 21) {
			for (int i = n; i > 0; i--) {
				fact *= i;
			}
			System.out.println("Factorial is: " + fact);
		} else {
			System.out.println(
					"Sorry!!! cannot store the factorial value for numbers grater than 20... VALUE TOO LARGE!!!");
		}
		sc.close();
	}

}

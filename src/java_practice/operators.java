package java_practice;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		int a, b, c;
		float s;
		double area;
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the two numbers: "); a = sc.nextInt(); b =
		 * sc.nextInt();
		 * 
		 * System.out.println("The sum is: " + (a + b));
		 * System.out.println("The product is: " + (a * b));
		 * System.out.println("The difference is: " + (a - b));
		 */
		// area = (a * b) / 2F;
		// System.out.println("Area: " + area);

		System.out.println("Enter the sides: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		s = (a + b + c) / 2f;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area is: " + area);
		sc.close();
	}

}

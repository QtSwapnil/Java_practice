package java_practice;

import java.util.Scanner;

public class expressions {

	public static void main(String[] args) {

		int l, b, h;
		double area, volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		System.out.println("Enter the hieght: ");
		h = sc.nextInt();
		area = 2 * (l * b + b * h + l * h);
		volume = l * b * h;
		System.out.println("Area is: " + area + "\nand vloume is: " + volume);
		sc.close();
	}

}

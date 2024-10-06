package java_practice;

import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {
		int n, m = 0, r = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		r = n;
		while (n > 0) {
			m = (m * 10) + (n % 10);
			n /= 10;
			count++;
		}
		System.out.println(r);
		if (m == r) {
			System.out.println(m + " is a Palindrome");
		} else
			System.out.println("Not a palindrome");
		sc.close();
	}

}

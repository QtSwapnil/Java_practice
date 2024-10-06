package java_practice;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// int B[] = { 0, 521, 21, 12 };
		Scanner sc = new Scanner(System.in);
		int B[] = new int[10];
		B[0] = 1;
		B[1] = 2;
		B[2] = 4;
		B[3] = 5;
		// System.out.println(B.length);
		// int A = 0, max = 0, max1 = 0;
		/*
		 * for (int x : B) { A += x; if (x > max) { max1 = max; max = x; } else if (x >
		 * max1) max1 = x; } System.out.println("Sub of Array: " + A);
		 * System.out.println("Max is " + max + " second max is " + max1);
		 */
		/*
		 * max = B.length; A = B[max - 1]; for (int i = B.length - 1; i > 0; i--) { B[i]
		 * = B[i - 1]; } B[0] = A; for (int x : B) { System.out.print(x + " "); }
		 */
		for (int x : B) {
			System.out.print(x + " ");
		}
//		System.out.println("\nEnter the element: ");
		// int a = sc.nextInt();
		System.out.println("\nEnter the position (1-10): ");
		int b = sc.nextInt();
		if (b > 0 && b <= 10) {
			for (int i = b - 1; i < B.length - 1; i++) {
				B[i] = B[i + 1];
			}

			/*
			 * for (int i = B.length - 1; i > b - 1; i--) { B[i] = B[i - 1]; } B[b - 1] = 0;
			 */
			System.out.println("");
			for (int x : B) {
				System.out.print(x + " ");
			}

		} else
			System.out.println("Enter position between 1-10");

		sc.close();
	}

}

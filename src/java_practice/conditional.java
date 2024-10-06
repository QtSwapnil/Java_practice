package java_practice;

public class conditional {

	public static void main(String[] args) {

		/*
		 * int a = 3, b = 4, c = 3; if (a > b && a > c)
		 * System.out.println("a is biggest number"); else if (b > c)
		 * System.out.println("b is biggest number"); else
		 * System.out.println("c is biggest number");
		 */
		// Scanner sc = new Scanner(System.in);

		/*
		 * Even/odd int n; System.out.println("Enter the number: "); n = sc.nextInt();
		 * 
		 * if (n % 2 == 0) System.out.println(n + " is a even number"); else
		 * System.out.println(n + " is a odd number");
		 *
		 * Checking Radix of number String str;
		 * System.out.println("Enter the String: "); str = sc.nextLine(); if
		 * (str.matches("[01]+")) System.out.println("Number is binary"); else if
		 * (str.matches("[0-7]+")) System.out.println("Number is octal"); else if
		 * (str.matches("[0-9]+")) System.out.println("Number is decimal"); else if
		 * (str.matches("[0-9A-F]+")) System.out.println("Number is hexadecimal"); else
		 * System.out.println("ye number galat he!!! thik se type kar");
		 */

		int year, count = 0;
		for (year = 2000; year < 3000; year++) {
			if (year > 0) {
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							System.out.println("Year " + year + " is a leap year");
							count++;
						} // else
							// System.out.println("Not a leap year");
					} else
						System.out.println("Year " + year + " is a leap year");
					count++;
				} // else
					// System.out.println("Not a leap year");
			} else
				System.out.println("Invalid year!!! Thik se type kar");
		}
		System.out.println(count);
		// sc.close();
	}

}

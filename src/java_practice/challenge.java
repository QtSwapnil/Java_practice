package java_practice;

import java.util.Scanner;

public class challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the website URL:");
		String site = sc.nextLine();
		String res1, res2;

		int i = site.indexOf(':');
		res1 = site.substring(0, i);
		if (res1.equals("http")) {
			System.out.println("Protocol: " + res1 + " Hyper text transfer protocol");
		} else if (res1.equals("ftp")) {
			System.out.println("Protocol: " + res1 + " File transfer protocol");
		}

		res2 = site.substring(site.lastIndexOf('.'));
		if (res2.contains("com")) {
			System.out.println("Protocol: " + res2 + " Commertial website");
		} else if (res2.contains("org")) {
			System.out.println("Protocol: " + res2 + " Organisation website");
		}
		System.out.println(res2);
		sc.close();
	}

}

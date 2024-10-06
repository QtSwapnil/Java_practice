package java_practice;

public class strings {

	public static void main(String[] args) {
		String res1, res2, str = "Programmer@gmail.com";
		int i = str.indexOf("@");

		res1 = str.substring(0, i);
		res2 = str.substring(++i);
		System.out.println(res1 + "\n" + res2);
		System.out.println(res2.contains("gmail.com"));
		System.out.println(res2.startsWith("gmail.com"));
	}
}

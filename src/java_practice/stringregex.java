package java_practice;

public class stringregex {

	public static void main(String[] args) {
		String str = "a$dasdf#ccAAA";
		System.out.println(str.replaceAll("[^a-zA-Z]*", ""));
		String str1 = "Nikita                              P         a  t  il";
		System.out.println(str1.replaceAll("\\s+", " ").trim());
		System.out.println(str1.length());
	}

}

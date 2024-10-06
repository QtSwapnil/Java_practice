package java_practice;

public class bitwise {

	public static void main(String[] args) {
		// int x = 10, y = 6, z;
		// z = x ^ y;

		// System.out.println("Result: " + z);
		int x = 0b1000;
		int y;
		y = x << 1; // x<<2 //x>>1 //x>>2
		System.out.println(y);

		x = -0b1010; // try with + and -
		y = x >> 1; // ~x
		System.out.println(String.format("%s", Integer.toBinaryString(x)));
		System.out.println(String.format("%s", Integer.toBinaryString(y)));

	}

}

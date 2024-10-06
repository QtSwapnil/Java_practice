package java_practice;

public class arrays {

	public static void main(String[] args) {
		/*
		 * int A[] = { 1, 2, 3, 4, 5 }; int B[] = new int[10]; for (int x : A)
		 * System.out.print(x + " "); System.out.println(""); for (int i = 0; i <
		 * A.length; i++) { B[i] = A[i]; } A = B; B = null; for (int x : A)
		 * System.out.print(x + " ");
		 */
		int A[][] = { { 7, 8, 9 }, { 4, 5, 6 }, { 1, 2, 3 } };
		int B[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int C[][] = new int[3][3];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		for (int x[] : C) {
			for (int c : x) {
				System.out.print(c + " ");
			}
			System.out.println("");
		}
	}

}

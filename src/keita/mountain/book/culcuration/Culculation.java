package keita.mountain.book.culcuration;

public class Culculation {

	public static void exapmle1(String[] args) {

		System.out.printf("Answer1 = %d", 1 + 2 * 3);
		System.out.print("\n");
		System.out.printf("Answer2 = %d", (1 + 2) * 3);

	}

	public static void exapmle2() {

		int x = 1, y = 2;
		double z;

		x += x;
		y *= y;

		z = x + y;

		System.out.printf("Hello World!! x = %d, y = %d, Root = %e", x, y, Math.sqrt(z));

	}

}



public class Culculation {

	public static void main(String[] args) {
		example1();
		example2();
		example3();
	}

	public static void example1() {

		System.out.printf("Answer1 = %d", 1 + 2 * 3);
		System.out.print("\n");
		System.out.printf("Answer2 = %d", (1 + 2) * 3);

	}

	public static void example2() {

		int x = 1, y = 2;
		double z;

		x += x;
		y *= y;

		z = x + y;

		System.out.printf("Hello World!! x = %d, y = %d, Root = %e", x, y, Math.sqrt(z));

	}

	public static void example3() {
		System.out.println("22 + 33" + 22 + 33);
		System.out.println("22 + 33" + 55);
		System.out.println("22 + 33" + (22 + 33));
	}

}

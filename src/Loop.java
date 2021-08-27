
public class Loop {

	public static void main(String[] args) {
		example1();
	}

	public static void example1() {

		Integer a = 11;

		// do-while
		do {
			System.out.print(a.toString() + ",");
			a++;
		} while (a <= 10);

		// while
		a = 11;
		while (a <= 10) {
			System.out.print(a.toString() + ",");
			a++;
		}

		// for
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + ",");
		}

	}

}

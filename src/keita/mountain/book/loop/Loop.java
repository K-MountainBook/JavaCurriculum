package keita.mountain.book.loop;

public class Loop {

	public static void exapmle1(String[] args) {

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

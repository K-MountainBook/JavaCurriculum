import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		example1();
		example2();
		example3_1();
		example3_2();

	}

	public static void example1() {
		String a = "a", b = "b", c = "c";

		switch (a) {
		case "a":
			System.out.println(a);
			// break;
		case "b":
			System.out.println(b);
			// break;
		case "c":
			System.out.println(c);
			// break;
		default:
			System.out.println("default");
			// break;
		}

	}

	private static void example2() {

		String a = "a";

		if (a.equals("c")) {
			System.out.println(a + "=c");
		} else if (a.equals("b")) {
			System.out.println(a + "=b");
		} else if (a.equals("a")) {
			System.out.println(a + "=a");
		}

	}

	public static void example3_1() {
		Scanner scn = new Scanner(System.in);

		int month = scn.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("�t");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("��");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�H");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�~");
			break;

		default:
			System.out.println("1-12����͂��Ă��������B");
			break;
		}

		scn.close();

	}

	public static void example3_2() {
		Scanner scn = new Scanner(System.in);

		int month = scn.nextInt();
		if (3 <= month && month <= 5) {
			System.out.println("�t");
		} else if (6 <= month && month <= 8) {
			System.out.println("��");
		} else if (9 <= month && month <= 11) {
			System.out.println("�H");
		} else if (12 <= month && month <= 2) {
			System.out.println("�~");
		} else {
			System.out.println("1-12����͂��Ă��������B");
		}

		scn.close();

	}

}

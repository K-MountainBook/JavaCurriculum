package keita.mountain.book.switchstatement;

public class SwitchStatement {

	public static void exapmle1(String[] args) {
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

}

import java.util.Scanner;

public class InputAndPrint {

	public static void main(String[] args) {
		example1();

	}

	private static void example1() {
		Scanner scn = new Scanner(System.in);
		int year;
		int month;
		int day;

		System.out.print("�N:");
		year = scn.nextInt();
		System.out.print("��:");
		month = scn.nextInt();
		System.out.print("��:");
		day = scn.nextInt();

		System.out.println(year + "�N" + month + "��" + day + "��");
		scn.close();
	}
}

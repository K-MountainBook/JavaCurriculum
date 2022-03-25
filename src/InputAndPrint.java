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

		System.out.print("年:");
		year = scn.nextInt();
		System.out.print("月:");
		month = scn.nextInt();
		System.out.print("日:");
		day = scn.nextInt();

		System.out.println(year + "年" + month + "月" + day + "日");
		scn.close();
	}
}

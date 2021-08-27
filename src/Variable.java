
public class Variable {

	public static void main(String[] args) {
		example1();
		// example2();
		example3();
	}

	public static void example1() {

		String mojiretsu1 = "今日は2021年";
		String mojiretsu2 = "1月1日です。";

		System.out.println(mojiretsu1);
		System.out.println(mojiretsu2);

		String mojiretsu3 = "12月31日です。";

		System.out.println(mojiretsu1);
		System.out.println(mojiretsu3);

		mojiretsu1 = "今日は2022年";

		System.out.println(mojiretsu1);
		System.out.println(mojiretsu2);

		System.out.println(mojiretsu1);
		System.out.println("4月1日です。");

	}

	private static void example2() {
		int i;

		System.out.println(i);

	}

	private static void example3() {

		int j = 33;

		System.out.println("変数を初期化した値は：" + j);

		j = 8192;

		System.out.println("変数に代入した値は：" + j);

	}

}


public class Variable {

	public static void main(String[] args) {
		example1();
		// example2();
		example3();
	}

	public static void example1() {

		String mojiretsu1 = "������2021�N";
		String mojiretsu2 = "1��1���ł��B";

		System.out.println(mojiretsu1);
		System.out.println(mojiretsu2);

		String mojiretsu3 = "12��31���ł��B";

		System.out.println(mojiretsu1);
		System.out.println(mojiretsu3);

		mojiretsu1 = "������2022�N";

		System.out.println(mojiretsu1);
		System.out.println(mojiretsu2);

		System.out.println(mojiretsu1);
		System.out.println("4��1���ł��B");

	}

	private static void example2() {
		int i;

		System.out.println(i);

	}

	private static void example3() {

		int j = 33;

		System.out.println("�ϐ��������������l�́F" + j);

		j = 8192;

		System.out.println("�ϐ��ɑ�������l�́F" + j);

	}

}

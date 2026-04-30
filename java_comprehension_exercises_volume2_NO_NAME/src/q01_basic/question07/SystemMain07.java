package q01_basic.question07;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		ConsoleReader cr = new ConsoleReader();

		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");

		int limit = 0;

		try {
			limit = cr.inputNumber();
		} catch (Exception e) {
			e.printStackTrace();
		}

		numberList.addFromOneTo(limit);
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの合計を計算します");

		int sum = 0;

		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");

		numberList.doubleListEachValue();
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");

		numberList.removeIndexOfFirstHalf();
		System.out.println(numberList.getNumbers());
	}
}

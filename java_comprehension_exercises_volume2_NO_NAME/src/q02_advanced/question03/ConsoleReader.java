package q02_advanced.question03;

import java.util.Scanner;

public class ConsoleReader {

	private Scanner scanner = new Scanner(System.in);

	public String inputString() {
		return scanner.nextLine();
	}

	public int inputNumber() {
		return Integer.parseInt(scanner.nextLine());
	}
}
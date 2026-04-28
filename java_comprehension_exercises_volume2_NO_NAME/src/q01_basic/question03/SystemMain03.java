package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		System.out.println("---SHOW DATA(NULL)---");

		Member m1 = new Member();
		m1.showMember();

		System.out.println("---SHOW DATA(Miura)---");

		Member m2 = new Member("Miura Manabu", 28, 2);
		m2.showMember();
	}
}

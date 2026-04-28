package q01_basic.question02;

public class SystemMain02 {
	public static void main(String[] args) {

		System.out.println("---SHOW DATA---");

		Member m = new Member();

		m.setName("Miura Manabu");
		m.setAge(30);
		m.setRank(1);

		m.showMember();

		System.out.println(">>>RANK UP>>>");

		m.rankUp();

		System.out.println("---GET RANK---");
		System.out.println("newRank:" + m.getRank());
	}
}

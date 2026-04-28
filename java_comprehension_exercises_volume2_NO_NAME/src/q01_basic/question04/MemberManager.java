package q01_basic.question04;

public class MemberManager {

	public static void showAllMembers(Member[] members) {
		for (Member m : members) {
			m.showMember();
		}
	}
}
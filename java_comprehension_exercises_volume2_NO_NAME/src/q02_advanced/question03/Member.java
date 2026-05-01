package q02_advanced.question03;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons = new ArrayList<>();

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRank() {
		return rank;
	}

	public Member() {
	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public static Member getInstance(int id, String password, String name, int age, int rank) {
		Member m = new Member(id, password, name, age, rank);

		Coupon c1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon c2 = Coupon.getInstance(2, 0.25, "今月の特典");

		m.coupons.add(c1);
		m.coupons.add(c2);

		return m;
	}

	public void showMember() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name +
				", age=" + age + ", rank=" + rank + ", coupons=" + coupons + "]";
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
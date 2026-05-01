package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons = new ArrayList<>();

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

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRank() {
		return rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Member [id=" + id +
				", password=" + password +
				", name=" + name +
				", age=" + age +
				", rank=" + rank +
				", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}
}
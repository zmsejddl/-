package section09;

public class EX09_10 { // 클래스 선언
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 1, "흰색");
		Phone p2 = new Phone("아이폰", 2);

		p1.phoneInfo();
		p2.phoneInfo();
	}
}

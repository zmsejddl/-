package section07;

public class EX07_11 { // 클래스 선언
	public static void main(String[] args) {
		Family father = new Family();
		Family son = new Family();

		father.address = "인천";
		System.out.println(son.address);
	}
}

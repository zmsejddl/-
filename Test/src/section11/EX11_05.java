package section11;

public class EX11_05 { // 클래스 선언
	public static void main(String[] args) {

		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();

		System.out.println();

		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging(); // 오버라이드한 메서드를 호출합니다
		// c.onTheDesk(); <- 에러
	}
}

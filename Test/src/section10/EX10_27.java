package section10;

public class EX10_27 { // 클래스 선언
	public static void main(String[] args) {
		Comic comicBook = new Comic("주머니 괴물", "미상", true);
		comicBook.info_title();
		comicBook.info_author();
		comicBook.info_color();
	}
}

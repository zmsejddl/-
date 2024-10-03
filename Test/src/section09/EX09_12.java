package section09;

public class EX09_12 { // 클래스 선언
	public static void main(String[] args) {
		Book b1 = new Book(); // <- 생성자 1
		System.out.println("b1.title: " + b1.title);
		System.out.println("b1.series: " + b1.series);
		System.out.println("b1.page: " + b1.page);

		Book b2 = new Book("멘토씨리즈 자바"); // <- 생성자 2
		System.out.println("b2.title: " + b2.title);
		System.out.println("b2.series: " + b2.series);
		System.out.println("b2.page: " + b2.page);

		Book b3 = new Book("신데렐라", 170); // <- 생성자 3
		System.out.println("b3.title: " + b3.title);
		System.out.println("b3.series: " + b3.series);
		System.out.println("b3.page: " + b3.page);

		Book b4 = new Book(5, "노인과 바다"); // <- 생성자 4
		System.out.println("b4.title: " + b4.title);
		System.out.println("b4.series: " + b4.series);
		System.out.println("b4.page: " + b4.page);
	}
}

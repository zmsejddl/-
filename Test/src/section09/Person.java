package section09;

public class Person { // 클래스 선언
	String name;
	int age;

	Person(String n, int a) {
		name = n;
		age = a;
	}

	void introduce() {
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");
	}
}

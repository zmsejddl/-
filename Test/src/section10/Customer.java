package section10;

public class Customer extends Person { // 자식 클래스 선언
	int memberID;

	Customer(String name, int age, int memberID) {
		super(name, age); // super 메서드를 통해서 부모 생성자에 매개변수 전달
							// 부모 객체 생성!
		this.memberID = memberID;
	}

	void enter() {
		System.out.println("회원번호: " + memberID + " (" + name + ", " + age + "세) 님 입장하셨습니다.");
		// name, age는 부모 클래스에게 상속받은 필드입니다.
	}
}

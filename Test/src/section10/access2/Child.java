package section10.access2;

import section10.access1.*;

public class Child extends Parent { // 클래스 선언
	void accessTest() {
		super.accessProtected(); // 이렇게 접근이 가능합니다.
		Parent p1 = new Parent();
		// p1.accessProtected(); <- 자식 클래스더라도, 객체로 접근하는것은 불가능합니다.
		// 에러: The method accessProtected() from the type Parent is not visible
	}
}

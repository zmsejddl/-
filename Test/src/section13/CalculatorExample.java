package section13;

class Calculator {
	private int val1; // 인스턴스 멤버
	private int val2;

	// 생성자를 통한 데이터 입력
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public class Calc {
		public int add() {
			return val1 + val2;
		}
	}
}

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 11); // 외부 클래스 선언
		Calculator.Calc c = cal.new Calc(); // 인스턴스 클래스 선언
		System.out.println("합: " + c.add());
	}
}

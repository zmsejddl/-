package section08;

public class EX08_05 {
	public static void main(String[] args) {
		Jogger jogger = new Jogger(); // 객체 생성
		jogger.name = "김나비";
		jogger.sayName(); // jogger 인스턴스의 sayName() 메서드 호출
		jogger.run(); // jogger 인스턴스의 run() 메서드 호출
	}
}

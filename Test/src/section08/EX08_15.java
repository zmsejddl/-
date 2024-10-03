package section08;

public class EX08_15 {
	public static void main(String[] args) {
		int[] nums = { 500, 200 }; // 배열 생성
		Calc calc = new Calc(); // Calc 객체 생성
		// calc 인스턴스의 sum 메서드를 호출하여 return된 결과값을 출력
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다");
	}
}

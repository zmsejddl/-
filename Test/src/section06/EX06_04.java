package section06;

public class EX06_04 {
	public static void main(String[] args) {
		// 10개의 배열을 선언
		int[] numbers = new int[10];

		// 배열에 랜덤 함수를 이용해 값을 입력
		for (int i = 0; i < numbers.length; i++) {
			// 랜덤 함수를 이용해 각 배열 위치에 값을 입력
			numbers[i] = (int) (Math.random() * 30) + 1;
		}

		// 배열 안에서 짝수만 구해서 합 구하기
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}

		// 출력 해보기
		for (int i = 0; i < numbers.length; i++) {
			// numbers 배열의 랜덤 값 출력
			System.out.print(numbers[i] + " ");
		}

		// 줄 바꾸기
		System.out.println();
		System.out.println("배열의 짝수들의 합: " + sum);
	}
}

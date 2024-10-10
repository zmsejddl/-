package section14;

import java.util.Scanner;

public class EX14_10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int val = 0;
		while (true) {
			try {
				System.out.println("숫자를 입력하세요(0~50): ");
				val = scan.nextInt();

				if (val == -1) {
					break;
				}

				if (val < 0 || val > 50) {
					// 임의의 예외 발생
					throw new Exception("숫자의 허용범위가 아닙니다.");
				}

			} catch (Exception e) {
				scan.nextLine(); // 라인 단위 스트림 쓰기 및 버퍼 지우개용
				System.out.println("에러 메시지: " + e.getMessage());
			}
		}

		scan.close();
		System.out.println("프로그램 종료.");
	}
}

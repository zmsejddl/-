package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionExample {
	// 성격 유형 검사를 위한 메서드
	public static void checkYourSelf(Scanner scan) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자있는 것이 좋다.");
		System.out.print("선택 > >");
		int check = scan.nextInt();
		// 성격 체크 후 출력
		if (check == 1) {
			System.out.println("당신은 ENFP");
		} else {
			System.out.println("당신은 ISFP");
		}
	}

	public static void main(String[] args) {
		// 스캐너 선언
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("=====성격 유형 검사를 시작합니다.=====");
			// 메서드 호출
			ThrowsExceptionExample.checkYourSelf(scan);

		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
		System.out.println("프로그램 종료");
	}
}

package section02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("나이를 입력해 주세요.");
		int age = scanner.nextInt(); // 정수형을 입력 받음
		System.out.printf("내 나이는 %d세 입니다.", age);
	}
}

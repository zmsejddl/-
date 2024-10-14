package section17;

//두 문장을 결합하는 함수 생성
interface StrConcat {
	String concat(String str1, String str2);
}

public class StringConcat {
	public static void main(String[] args) {
		String str = "";

		StrConcat strConcat = (s, v) -> {
			// 지역변수 재정의 시 오류
			str = s + v;
			return str;
		};
	}
}

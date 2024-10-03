package section08;

public class Calc {
	public int sum(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}

		return result; // 매개변수로 받은 값을 모두 더한 result 값을 다시 반환함
	}
}

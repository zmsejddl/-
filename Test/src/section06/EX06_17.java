package section06;

public class EX06_17 {
	public static void main(String[] args) {

		int[] score = { 90, 92, 93 };

		int sum = 0;
		double avg = 0;

		for (int val : score) {
			sum += val;
		}

		avg = (double) sum / 3;

		System.out.println("총점: " + sum + ", 평균: " + avg);
	}
}

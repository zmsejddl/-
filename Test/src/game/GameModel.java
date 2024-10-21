package game;

import util.DBcon;

public class GameModel {

	int[] inputArr = new int[3];
	int[] answerArr;
	int resultStrike = 0;
	int resultBall = 0;
	int resultOut = 3;

	public GameModel(int[] answerArr, int[] inputArr) {
		this.answerArr = answerArr;
		this.inputArr = inputArr;
		check();
	}

	// 게임 로직
	public void check() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (inputArr[i] == answerArr[j]) {
					if (i == j) {
						resultStrike++; // Strike
						resultOut--;
					} else {
						resultBall++; // Ball
						resultOut--;
					}
				}
			}
		}
	}

	// 결과 리턴
	public int[] getResult() {
		int[] resultArr = { resultStrike, resultBall, resultOut };
		return resultArr;
	}

	// DB에 저장
	public void saveRank(String name, int time) {
		DBcon db = new DBcon();
		db.save(name, time);
	}
}

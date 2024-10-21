package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import app.MainController;

public class GameController implements ActionListener {
	final int MAX_SIZE = 3;

	int count = 1;	// 횟수 카운트
	int answerArr[];	//정답 배열
	GameView gameView;	//게임 화면

	long beforeTime;

	public GameController() {
		Random random = new Random();	//랜덤 숫자 생성 객체

		List<Integer> list = new ArrayList<Integer>();
		answerArr = new int[MAX_SIZE];

		int index = 0;

		while (list.size() < MAX_SIZE) {
			int ranNum = random.nextInt(8) + 1;	//1~9까지 숫자를 받아옵니다.
			if (!list.contains(ranNum)) {
				list.add(ranNum);
				answerArr[index++] = ranNum;
				System.out.print(answerArr[index - 1] + " ");
			}
		}

		beforeTime = System.currentTimeMillis();	//코드 실행 전에 시간을 받아옵니다.

		gameView = new GameView();
		gameView.btn_submit.addActionListener(this);
		gameView.btn_exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == gameView.btn_submit) {
			try {
				//입력한 숫자 얻기
				int[] inputArr = new int[3];
				inputArr[0] = Integer.parseInt(gameView.tf_num1.getText());
				inputArr[1] = Integer.parseInt(gameView.tf_num2.getText());
				inputArr[2] = Integer.parseInt(gameView.tf_num3.getText());

				//모델 생성
				GameModel game = new GameModel(answerArr, inputArr);
				int[] resultArr = game.getResult();

				String result = count + "회 시도 ... " + inputArr[0] + " " + inputArr[1] + " " + inputArr[2] + " : "
						+ resultArr[0] + "S " + resultArr[1] + "B " + resultArr[2] + "O\n";

				if (resultArr[0] == 3) {	//3 스트라이크
					result += "축하합니다! 게임에 이겼습니다.";

					long time = timeCheck();
					String name = JOptionPane.showInputDialog(null, "게임에 이겼습니다. 이름을 입력하세요.", "축하합니다.",
							JOptionPane.OK_CANCEL_OPTION);
					System.out.println(name + "님, " + time + "초");

					game.saveRank(name, (int) time);	//Model에 값 전달 -> DB에 삽입
					gameView.stop();

				} else if (count++ == 10) {
					result += "게임에 졌습니다.";
					gameView.stop();
				}

				//View에 결과 전달
				gameView.addResult(result);

			} catch (NumberFormatException e1) {
				System.out.println("숫자를 입력하세요");
			}
		} else if (e.getSource() == gameView.btn_exit) {
			new MainController();
			gameView.setVisible(false);
		}
	}

	public long timeCheck() {
		long afterTime = System.currentTimeMillis();
		return (afterTime - beforeTime) / 1000;
	}

}

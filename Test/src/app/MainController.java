package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.GameController;
import rank.RankController;

public class MainController implements ActionListener {
	MainView mainView;

	public MainController() {
		mainView = new MainView();
		mainView.btn_game.addActionListener(this); // 각 버튼에 귀를 달아줍니다.
		mainView.btn_rank.addActionListener(this);
	}

	// ActionListener 인터페이스의 추상 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mainView.btn_game) { // 게임 시작 버튼이 클릭되면
			new GameController();
			mainView.setVisible(false); // 메인 화면이 사라집니다.
		} else if (e.getSource() == mainView.btn_rank) { // 랭킹 확인 버튼이 클릭되면
			new RankController();
			mainView.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new MainController(); // 프로그램의 시작을 담당합니다.
	}
}

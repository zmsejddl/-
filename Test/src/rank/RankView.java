package rank;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RankView extends JFrame {
	JLabel la_rank = new JLabel("<랭킹 안내>");

	JButton btn_exit = new JButton("메인으로");

	public RankView(String[][] arr) {
		setTitle("랭킹");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		String rank[][] = arr;
		String column[] = { "순위", "이름", "걸린 시간" };

		JTable ta_rank = new JTable(rank, column);
		JScrollPane scrollpane = new JScrollPane(ta_rank);

		// 창 가로, 창 세로, 폭, 높이
		la_rank.setBounds(200, 30, 100, 30);
		btn_exit.setBounds(470, 10, 80, 30);
		scrollpane.setBounds(160, 60, 200, 200);

		add(la_rank);
		add(scrollpane);
		add(btn_exit);

		setSize(600, 400);
		setVisible(true);
	}
}

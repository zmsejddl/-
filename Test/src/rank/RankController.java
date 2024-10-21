package rank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.MainController;
import util.DBcon;

public class RankController implements ActionListener {

	RankView rankView;

	public RankController() {
		DBcon db = new DBcon();
		String[][] resultArr = db.findAll();
		rankView = new RankView(resultArr);
		rankView.btn_exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rankView.btn_exit) {
			new MainController();
			rankView.setVisible(false);
		}
	}

}

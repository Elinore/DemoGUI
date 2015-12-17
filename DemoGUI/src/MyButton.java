import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyButton extends JFrame implements ActionListener {
	private Logic myLogic;
	
	public MyButton(Logic myLogic) {
		this.myLogic = myLogic;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("Logic 1: increase")) {
			myLogic.increment();
		}
		if (cmd.equals("Logic 1: decrease")) {
			myLogic.decrease();
		}
		System.out.println(myLogic.getCounter());
	}

}

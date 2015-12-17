import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyButton2 extends JFrame implements ActionListener {
	private Logic myLogic;
	private JFrame frame;
	
	public MyButton2(Logic logic) {
		myLogic = logic;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("Logic 1: increase amount")) {
			int ans = Integer.parseInt(JOptionPane.showInputDialog("Increase what amount?"));
			myLogic.incrementAmount(ans);
		}
		if (cmd.equals("Logic 1: decrease amount")) {
			int ans = Integer.parseInt(JOptionPane.showInputDialog("Decrease what amount?"));
			myLogic.decrementAmount(ans);
		}
		System.out.println(myLogic.getCounter());
	}

}

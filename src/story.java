import javax.swing.JOptionPane;

public class story {
public static void main(String[] args) {
	int heli = -1;
	int steal = -1;
	int run = -1;
	int start =-1;
 start = JOptionPane.showOptionDialog(null, "The helicopter crashes! What do you do next?", "Crash", 0, JOptionPane.INFORMATION_MESSAGE,
		null, new String[] { "Run to the ocean", "Steal a car", "Blow up the helicopter" }, null);
	
	if (start == 0) {
		 run =JOptionPane.showOptionDialog(null, "At the ocean you find some friends. What happens after?", "Crash", 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Talk about the crash", "Have a drink", "Hijack a car" }, null);
	}
	if (start == 1) {
		 steal =JOptionPane.showOptionDialog(null, "You crash into the police headquarters. What do you do next!", "Crash", 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Steal a cop car and drive home", "Tell the police the truth", "Casually walk to In-n-Out" }, null);
	}
	if (start == 2) {
		heli = JOptionPane.showOptionDialog(null, "You get injured but the medics find you. What do you do next?", "Crash", 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Recover in the hospitial", "Give up", "Convice them your fine and go home" }, null);
	}
	
	if (heli == 0 && heli == 2 && steal == 0 && steal == 2) {
		JOptionPane.showMessageDialog(null, "You live a pleasant rest of your life!");
	}
	if (heli == 1) {
		JOptionPane.showMessageDialog(null, "You die!");
	}
	if (steal == 1 ) {
		JOptionPane.showMessageDialog(null, "Everyone gets medical attention and you go to jail for 1 month for your crimes!");
	}
	
	if (run == 0 && run == 1) {
		JOptionPane.showMessageDialog(null, "Your friends laugh at you and you live happily after!");
	}
	if (run == 2) {
		JOptionPane.showMessageDialog(null, "You go to jail for 3 years after the cops find you!");
	}
	
	
	
}
}

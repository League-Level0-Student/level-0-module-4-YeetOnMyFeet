import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What score did you get on your test?");
			int score = Integer.parseInt(test);
			if (score >= 90) {
				JOptionPane.showMessageDialog(null, "You must've studied a lot for that test!");
			}
			else if (score >= 80 && score <= 89) {
				JOptionPane.showMessageDialog(null, "That's a horrible score! YOU NEED TO STUDY FOR THIS TEST!");
			}
			else if (score >= 70 && score <= 79) {
				JOptionPane.showMessageDialog(null, "That's an even worse score! STUDY HARD AND BE CONFIDENT!");
			}
			else if (score <= 69) {
				JOptionPane.showMessageDialog(null, "YOU ARE FAILING! MAKE STUDYING YOUR NUMBER ONE PRIORITY!");
			}
	
	
	
	
	
	
}
	
	
	
}

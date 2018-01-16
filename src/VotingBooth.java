import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you? (in years)");
		int years = Integer.parseInt(age);
		if (years >= 18) {
			String president = JOptionPane.showInputDialog("Who should the next president be?");
			JOptionPane.showMessageDialog(null, president + " is a good choice.");
		}
		if (years < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
}

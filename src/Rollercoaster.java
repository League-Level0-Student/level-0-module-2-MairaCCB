import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you? (in inches)");
	int inches = Integer.parseInt(height);
	if(inches>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}
	if(inches<=48) {
		JOptionPane.showMessageDialog(null, "Sorry, come back when you have grown more.");
	}
}
}
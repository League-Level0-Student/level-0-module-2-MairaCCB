package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		

		Random number = new Random();
		number.nextInt(51);
		int RandomNumber = 0;
		
		JOptionPane.showMessageDialog(null, RandomNumber = number.nextInt(101)+50);
		JOptionPane.showMessageDialog(null, RandomNumber = number.nextInt(76)+100);
		JOptionPane.showMessageDialog(null, RandomNumber = number.nextInt(240)+175);
		JOptionPane.showMessageDialog(null, RandomNumber = number.nextInt(206)+12);
		
		JOptionPane.showMessageDialog(null, RandomNumber = number.nextInt(101)+50 +""+ RandomNumber = number.nextInt(76)+100+""+RandomNumber = number.nextInt(240)+175);
		
	}
}

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Enter a number!");
	int number2 = Integer.parseInt(number);
	for (int i=2; i < number2; i++) {
		if(number2 % i==0) {
		
		JOptionPane.showMessageDialog(null, " NOT PRIME!");
		System.exit(0);
	}
	
	

	}
	JOptionPane.showMessageDialog(null, "PRIME");
}
}
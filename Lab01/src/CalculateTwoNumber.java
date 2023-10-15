import javax.swing.JOptionPane;

public class CalculateTwoNumber {
	
	public static void main(String[] args) {	
		String num1, num2, Calculate;
		double one, two;
		
		num1 = JOptionPane.showInputDialog(null," Insert the first number : ", "Calculate", JOptionPane.INFORMATION_MESSAGE);
		one = Double.parseDouble(num1);
		num2 = JOptionPane.showInputDialog(null," Insert the second number : ", "Calculate", JOptionPane.INFORMATION_MESSAGE);
		two = Double.parseDouble(num2);	
		
		Calculate = "<html>" + one + "+" + two + "="+ (one + two)+ "<br>";
		Calculate += one + "-" + two + "="+ (one - two)+ "<br>";
		Calculate += one + "*" + two + "="+ (one * two)+ "<br>";
		Calculate += one + "/" + two + "="+ Math.round(one/two) + "</html>";
		
		
		JOptionPane.showMessageDialog(null,Calculate, "Result :", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static boolean isNumber(String str ){
		try {
			Double.parseDouble(str);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		String Str1, Str2;
		String sum = " You're just entered : ";
		do{
			Str1 = JOptionPane.showInputDialog(null,"Please input the first number :", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
			if(isNumber(Str1) == false) {
			JOptionPane.showMessageDialog(null, "Your input is not number !","Error", JOptionPane.ERROR_MESSAGE);
		}
		}while(!isNumber(Str1));
		
		sum += Str1 + " , ";
		
		do{
			Str2 = JOptionPane.showInputDialog(null,"Please input the second number :", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
			if(isNumber(Str2) == false) {
			JOptionPane.showMessageDialog(null, "Your input is not number !","Error", JOptionPane.ERROR_MESSAGE);
		}
		}while(!isNumber(Str2));
		sum += Str2 + "\n";
		
		JOptionPane.showMessageDialog(null, sum,"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}

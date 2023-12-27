import java.util.Scanner;

import javax.swing.JOptionPane;

public class GiaiPhuongTrinhBac2 {
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
		String Str1, Str2, Str3;
		String sum = " Your equation : ";
		// Enter the equation to solve
		do{
			Str1 = JOptionPane.showInputDialog(null,"Please input the first number :", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
			if(isNumber(Str1) == false) {
			JOptionPane.showMessageDialog(null, "Your input is not number !","Error", JOptionPane.ERROR_MESSAGE);
		}
		}while(!isNumber(Str1));
		double a = Double.parseDouble(Str1);
		sum += Str1 + "x^2 + ";
		
		do{
			Str2 = JOptionPane.showInputDialog(null,"Please input the second number :", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
			if(isNumber(Str2) == false) {
			JOptionPane.showMessageDialog(null, "Your input is not number !","Error", JOptionPane.ERROR_MESSAGE);
		}
		}while(!isNumber(Str2));
		double b = Double.parseDouble(Str2);
		sum += Str2 + "x + ";
		
		do{
			Str3 = JOptionPane.showInputDialog(null,"Please input the third number :", "Input the third number", JOptionPane.INFORMATION_MESSAGE);
			if(isNumber(Str1) == false) {
			JOptionPane.showMessageDialog(null, "Your input is not number !","Error", JOptionPane.ERROR_MESSAGE);
		}
		}while(!isNumber(Str1));
		double c = Double.parseDouble(Str3);
		sum += Str3;
		JOptionPane.showMessageDialog(null, sum,"Method explanation", JOptionPane.INFORMATION_MESSAGE);
		
		//Displays the results of solving the equation
		double dental = b*b - (4*a*c);
		if(dental < 0) {
			JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);		
		}else if(dental == 0) {
			double x = (-b)/(2*a);
			JOptionPane.showMessageDialog(null, "x = " + x ,"Result",JOptionPane.INFORMATION_MESSAGE  );
		}else {
			double x1 = (-b-Math.sqrt(dental))/(2*a);
			double x2 = (-b+Math.sqrt(dental))/(2*a);
			String str = "<html> x1 = " + x1 + ";" + "<br>";
			str += "x2 = " + x2 +";"+ "</html>";
			JOptionPane.showMessageDialog(null, str, "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		
	
}
}
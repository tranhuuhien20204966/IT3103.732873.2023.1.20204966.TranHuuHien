	import javax.swing.JOptionPane;
	
		public class TheEquationTwoVar{
		public static void main(String[] args) {
			String Str1, Str2, Str3, Str4;
			String Str5, Str6;
			String sum = " Your equation : ";
			// Enter the equation to solve
			Str1 = JOptionPane.showInputDialog(null," Insert the number a11 : ", "equation", JOptionPane.INFORMATION_MESSAGE);
			double a11 = Double.parseDouble(Str1);
			Str2 = JOptionPane.showInputDialog(null," Insert the number a12 : ", "equation", JOptionPane.INFORMATION_MESSAGE);
			double a12 = Double.parseDouble(Str2);
			Str3 = JOptionPane.showInputDialog(null," Insert the number b1 : ", "equation", JOptionPane.INFORMATION_MESSAGE);
			double b1 = Double.parseDouble(Str3);
			Str4 = JOptionPane.showInputDialog(null," Insert the number a21 : ", "equation", JOptionPane.INFORMATION_MESSAGE);
			double a21 = Double.parseDouble(Str4);	
			Str5 = JOptionPane.showInputDialog(null," Insert the number a22 : ", "equation", JOptionPane.INFORMATION_MESSAGE);
			double a22 = Double.parseDouble(Str5);
			Str6 = JOptionPane.showInputDialog(null," Insert the number b2 : ", "equation", JOptionPane.INFORMATION_MESSAGE);
			double b2 = Double.parseDouble(Str6);	
			
			//Displays the results of solving the equation
			int check = (int) Math.round(a11*a22 - a12*a21) ;
			System.out.println(check);
			if(check != 0) {
				double x2 = (b1*a21-a11*b2)/(a11*a22 - a12*a21);
				double x1 = (a12*b2-b1*a22)/(a11*a22-a12*a21);
				String str = "<html>x1 = " + ((long)(x1*100))/100 + ";"+"<br>";
				str += "x2 = " +((long)(x2*100))/100+";"+"</html>";
				JOptionPane.showMessageDialog(null, str , "Result", JOptionPane.INFORMATION_MESSAGE);		
			}else {
				if(a11/a21 == a12/a22 && a11/a21 != b1/b2) {
				JOptionPane.showMessageDialog(null, "No solution","Result",JOptionPane.INFORMATION_MESSAGE  );
			}else {
				JOptionPane.showMessageDialog(null, "Infinitely many solutions","Result",JOptionPane.INFORMATION_MESSAGE  );
			}
		}
		
	}	
	}

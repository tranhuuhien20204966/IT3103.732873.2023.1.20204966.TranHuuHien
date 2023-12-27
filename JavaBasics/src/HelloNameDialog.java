import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
		String something;
		something = JOptionPane.showInputDialog("Please input somthing : ");
		JOptionPane.showMessageDialog(null,"Hi yor input is : "+ something);
		System.exit(0);
	}
}

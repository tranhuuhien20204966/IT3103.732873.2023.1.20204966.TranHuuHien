package hust.soict.vn.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
	private TextField tfInput;
	private TextField tfOuput;
	private int sum = 0;
	
	public AWTAccumulator() {
		setLayout(new GridLayout(2,2));
		add(new Label("Enter an Integer :"));
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new Label("the Accumulated is :"));
		tfOuput = new TextField(10);
		tfOuput.setEditable(false);
		add(tfOuput);
		
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AWTAccumulator();
//		System.exit(0);
	}
	
	private class TFInputListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOuput.setText(sum + "");
		
		}
	}
}

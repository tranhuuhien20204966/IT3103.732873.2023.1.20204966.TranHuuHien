package hust.soict.vn.swing;

import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class SwingAccumulator extends JFrame {
	private TextField tfInput;
	private TextField tfOuput;
	private int sum = 0;
	
	public SwingAccumulator() {
		Container cp = getContentPane(); 
		cp.setLayout(new GridLayout(2,2));
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new SwingAccumulator();
		
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

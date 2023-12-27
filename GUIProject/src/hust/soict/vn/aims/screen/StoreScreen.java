package hust.soict.vn.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.store.Store;
import hust.soict.vn.aims.media.media;

public class StoreScreen extends JFrame{
	private Store store;
	
	public StoreScreen(Store store){
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(creatNorth(), BorderLayout.NORTH);
		cp.add(creatCenter(),BorderLayout.CENTER );
		
		this.setVisible(true);
		this.setTitle("Store");
		this.setSize(1024,768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	JPanel creatNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(creatMenuBar());
		north.add(creatHeader());
		return north;
	}
	
	JMenuBar creatMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View Store"));
		menu.add(new JMenuItem("View Cart"));
		
		JMenuBar menuBar = new JMenuBar();
			
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel creatHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header,BoxLayout.X_AXIS));
		JLabel title = new JLabel("AIMS");
		// Thay doi font chu
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN,50));
		// Thay doi mau chu
		title.setForeground(Color.RED);
		
		JButton cart = new JButton("View cart");
		//Thiet lap kich thuoc uu tien va toi da
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));	
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));	
		
		return header;
	}
	
	JPanel creatCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		ArrayList<media> mediaInStore = store.getItemsInStore();
		for( int i = 0; i < 9 ; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		return center;
	}
	
	
	
	
	
	
}

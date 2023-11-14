package hust.soict.dsai.test.cart;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King","Animation", 
				"Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars","Science Fiction",
				"George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin","Animation",18.99f);
		cart.addDigitalVideoDisc(dvd3);
				
		cart.print();
		
		int choice =0 ;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println(" Do you want to search DVD : "  );
		System.out.println(" 1. Search by ID");
		System.out.println(" 2. Search by Title");
		System.out.println(" 3. Exit");
		System.out.println(" Please choose :");
		choice = sc.nextInt();
		sc.nextLine();
		if( choice == 1) {
			int id;
			System.out.println("Enter your id :");
			id =sc.nextInt();
			sc.nextLine();
			cart.searchbyId(id);
		}else if(choice == 2) {
			System.out.println("Enter your title :");
			String title = sc.nextLine();
			cart.searchbyTitle(title);
		}else {
			break;
		}
	}while(choice ==1 || choice ==2 );
}
}


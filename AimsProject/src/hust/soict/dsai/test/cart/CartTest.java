package hust.soict.dsai.test.cart;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.vn.aims.media.CompactDisc;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.book;

public class CartTest {
	public static void main(String[] args) {
//		//Create a new cart
//		Cart cart = new Cart();
//		
//		//Create new DVD objects and add them to the cart
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King","Animation", 
//				"Roger Allers", 87, 19.95f);
//		cart.addDigitalVideoDisc(dvd1);
//		
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars","Science Fiction",
//				"George Lucas", 87, 24.95f);
//		cart.addDigitalVideoDisc(dvd2);
//		
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin","Animation",18.99f);
//		cart.addDigitalVideoDisc(dvd3);
//				
//		cart.print();
//		
//		int choice =0 ;
//		Scanner sc = new Scanner(System.in);
//		do {
//		System.out.println(" Do you want to search DVD : "  );
//		System.out.println(" 1. Search by ID");
//		System.out.println(" 2. Search by Title");
//		System.out.println(" 3. Exit");
//		System.out.println(" Please choose :");
//		choice = sc.nextInt();
//		sc.nextLine();
//		if( choice == 1) {
//			int id;
//			System.out.println("Enter your id :");
//			id =sc.nextInt();
//			sc.nextLine();
//			cart.searchbyId(id);
//		}else if(choice == 2) {
//			System.out.println("Enter your title :");
//			String title = sc.nextLine();
//			cart.searchbyTitle(title);
//		}else {
//			break;
//		}
//	}while(choice ==1 || choice ==2 );
		Cart store = new Cart();
		
		DigitalVideoDisc dvd = new DigitalVideoDisc(1, "Nguoi cung kho", "Kham pha", 10, 100, "Tran Huu Hien");
		book book = new book(2, "Nguoi tinh anh trang", "Tinh cam", 13, null);
		CompactDisc cd = new CompactDisc(3, "MTP", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd1 = new CompactDisc(4, "Anh nho em", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd2 = new CompactDisc(4, "Anh nho em 1", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd3 = new CompactDisc(4, "Anh nho em 2", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd4 = new CompactDisc(4, "Anh nho em 3", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd5 = new CompactDisc(4, "Anh nho em 4", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd6 = new CompactDisc(4, "Anh nho em 5", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		store.addMedia(cd);
		store.addMedia(book);
		store.addMedia(dvd);
		store.addMedia(cd1);
		store.addMedia(cd2);
		store.addMedia(cd3);
		store.addMedia(cd4);
		store.addMedia(cd5);
		store.addMedia(cd6);
		
		store.displayCart();
		store.removeMedia(cd6);
		
		store.displayCart();
}
}


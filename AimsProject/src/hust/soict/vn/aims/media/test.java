package hust.soict.vn.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;

public class test {
	public static void main(String[] args) {
		ArrayList<String> listAuthor = new ArrayList<>();
		listAuthor.add("To Hoai");
		listAuthor.add("Pham Tuan");
		listAuthor.add("Pham Duy");
		ArrayList<track> listTrack = new ArrayList<>();
		track trk1 = new track("Co don", 2);
		listTrack.add(trk1);
		Cart cart = new Cart();
		
			
		book Book = new book(listAuthor, "Tat Den", 3.14f);
		DigitalVideoDisc dvd = new DigitalVideoDisc(2f, "Pham Tuan", "Em cua ngay hom qua", 20f);
		CompactDisc cd = new CompactDisc(3f, "Anh", "Minh", 10f, "Mi", listTrack);
		
		cart.addMedia(dvd);
		cart.addMedia(cd);
		cart.addMedia(Book);
		System.out.println("\n");
		
		cart.sortByCostTitle();
		cart.sortByTitleCost();
		
		
		
	}
}

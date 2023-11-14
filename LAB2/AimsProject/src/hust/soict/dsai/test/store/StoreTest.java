package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King","Animation", 
				"Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars","Science Fiction",
				"George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(1,"Aladin","Animation",18.99f);
		// Add dvds to the store
		store.addDVD(dvd1, dvd2, dvd3);
		System.out.println("List after adding :");
		store.displayItem();
		
		//Remove dvd3 from store
		store.removeDVD(dvd3);
		System.out.println("List after deletion :");
		store.displayItem();
		

	}
}

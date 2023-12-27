package hust.soict.vn.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.vn.aims.media.CompactDisc;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.book;

public class testScreen {
	public static void main(String[] args) {
//		Store store = new Store();
//		
//		DigitalVideoDisc dvd = new DigitalVideoDisc(1, "Nguoi cung kho", "Kham pha", 10, 100, "Tran Huu Hien");
//		book book = new book(2, "Nguoi tinh anh trang", "Tinh cam", 13, null);
//		CompactDisc cd = new CompactDisc(3, "MTP", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd1 = new CompactDisc(4, "Anh nho em", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd2 = new CompactDisc(4, "Anh nho em 1", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd3 = new CompactDisc(4, "Anh nho em 2", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd4 = new CompactDisc(4, "Anh nho em 3", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd5 = new CompactDisc(4, "Anh nho em 4", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd6 = new CompactDisc(4, "Anh nho em 5", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		store.addMedia(cd);
//		store.addMedia(book);
//		store.addMedia(dvd);
//		store.addMedia(cd1);
//		store.addMedia(cd2);
//		store.addMedia(cd3);
//		store.addMedia(cd4);
//		store.addMedia(cd5);
//		store.addMedia(cd6);
//		new StoreScreen(store);
		
		//test cart
		
		Cart store = new Cart();
		
		DigitalVideoDisc dvd = new DigitalVideoDisc(1, "Nguoi cung kho", "Kham pha", 10, 100, "Tran Huu Hien");
		book book = new book(2, "Nguoi tinh anh trang", "Tinh cam", 13, null);
		CompactDisc cd = new CompactDisc(3, "MTP", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
//		CompactDisc cd1 = new CompactDisc(4, "Anh nho em", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd2 = new CompactDisc(4, "Anh nho em 1", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd3 = new CompactDisc(4, "Anh nho em 2", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd4 = new CompactDisc(4, "Anh nho em 3", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd5 = new CompactDisc(4, "Anh nho em 4", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		CompactDisc cd6 = new CompactDisc(4, "Anh nho em 5", "Nhac tre", 10, 122, " Son Tung", "Son Tung", null);
		store.addMedia(cd);
		store.addMedia(book);
		store.addMedia(dvd);
//		store.addMedia(cd1);
		store.addMedia(cd2);
		store.addMedia(cd3);
		store.addMedia(cd4);
		store.addMedia(cd5);
		store.addMedia(cd6);
		new CartScreen(store);
	}
}

package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import hust.soict.vn.aims.media.CompactDisc;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.MediaComparatorByCostTitle;
import hust.soict.vn.aims.media.MediaComparatorByTitleCost;
import hust.soict.vn.aims.media.book;
import hust.soict.vn.aims.media.media;
import hust.soict.vn.aims.media.track;


public class Cart   {
	private ArrayList<media> itemsOrdered = new ArrayList<>();
	public Cart() {
        this.itemsOrdered = new ArrayList<>();
    }

	// Generate getter and setter
	public ArrayList<media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
//	Check the number of DVDs in the cart
//
//	public int currentOrdered() {
//		int count  = 0; 
//		for( int i = 0 ; i < MAX_NUMBERS_ORDERED; i++) {
//			if(itemsOrdered[i] != null ) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
	

	//Displays DVD list
//	public void displayCart() {
//		for(DigitalVideoDisc disc : itemsOrdered) {
//			 if(disc != null) {
//			 System.out.println(disc);
//			 System.out.println("\n");
//			 }
//		}
//	}
	
	//Add media to cart
	public void addMedia(media Media){
		int count = 0;
		if(itemsOrdered == null) {
			 itemsOrdered.add(Media);
			 System.out.println("Add "+ Media.getTitle() +" of media successfully !");
			 System.out.println(Media.toString());
		}else {
		for(media media : itemsOrdered) {
			if(media.equals(Media)) {
				 System.out.println("This media already exist");
				 count++;
		}
		}
			 if(count == 0) {
				 itemsOrdered.add(Media);
				 System.out.println("Add "+ Media.getTitle() +" of media successfully !");
				 System.out.println(Media.toString());
			 }
		}
		}
	
	
		
	//Remove media from cart
		public void removeMedia(media Media) {
			Iterator<media> iterator = itemsOrdered.iterator();
			while(iterator.hasNext()){
				media media = iterator.next();
				if(media.equals(Media)) {
					iterator.remove();
					System.out.println("Remove " + Media.getTitle()+ " successfully!");
				}
			}
		}
		
	
	//Add list of DVD
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
//		int maxOrdered = currentOrdered();
//		if(maxOrdered ==  MAX_NUMBERS_ORDERED) {
//			System.out.println("\nCan't add this DVD, your cart is full!");
//		}else {
//			for(int i = 0; i < dvdList.length ; i++){
//				if(currentOrdered() == MAX_NUMBERS_ORDERED) {
//					break;
//				}else
//					itemsOrdered[maxOrdered + i] = dvdList[i];
//					System.out.println("\nThis "+ dvdList[i].getTitle() + " add successfull");
//		}
//	}
//	}
	//Add an arbitrary number of arguments for dvd
//	public void addDigitalVideoDisc(DigitalVideoDisc... dvds){
//		int maxOrdered = currentOrdered();
//		int i = 0;
//		for( DigitalVideoDisc dvd : dvds) {
//			if(currentOrdered() == MAX_NUMBERS_ORDERED) {
//				break;
//			}else
//				itemsOrdered[maxOrdered + i] = dvd;
//				System.out.println("\nThis "+ dvd.getTitle() + " add successfull");
//				i++;
//		}
//		
//	}
//	//Add two DVD
//	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
//		int maxOrdered = currentOrdered();
//		if(maxOrdered ==  MAX_NUMBERS_ORDERED) {
//			System.out.println("\nCan't add more DVD, your cart is full!");
//		}else {
//			itemsOrdered[maxOrdered] = dvd1;
//			System.out.println("\nThis "+ dvd1.getTitle() + " add successfull");
//			if(currentOrdered() == MAX_NUMBERS_ORDERED ) {
//				System.out.println("\nCan't add this dvd2, your cart is full!");
//			}else
//				itemsOrdered[maxOrdered + 1] = dvd2;
//				System.out.println("\nThis "+ dvd2.getTitle() + " add successfull");
//				
//		}
//	}
//	
//	//Remove DVD from cart
//	public void RemoveDigitalVideoDisc(DigitalVideoDisc disc) {
//	    int maxOrdered = currentOrdered();
//	    int count = -1; 
//	    for (int i = 0; i < maxOrdered; i++) {
//	        if (itemsOrdered[i] == disc) {
//	            count = i;
//	            break; 
//	        }
//	    }
//	    if (count == -1) {
//	        System.out.println("This " + disc.getTitle() + " is not found");
//	    } else {
//	        
//	        for (int i = count; i < maxOrdered - 1; i++) {
//	            itemsOrdered[i] = itemsOrdered[i + 1];
//	        }  
//	        itemsOrdered[maxOrdered - 1] = null;
//
//	        System.out.println("This " + disc.getTitle() + " has been deleted");
//	    }   
//	}
		
	// Sum of cost in cart
	public float totalCost() {
		float totalCost = 0;
		for(media media : itemsOrdered) {
			totalCost += media.getCost();
		}
		return totalCost;
	}
	
	public void sortByTitleCost() {
		Comparator<media> comparator = new MediaComparatorByTitleCost();
		Collections.sort(itemsOrdered,comparator);
		for (media media : itemsOrdered) {
            System.out.println(media);
        }
		System.out.println("\n");
	}
	public void sortByCostTitle() {
		Comparator<media> comparator = new MediaComparatorByCostTitle();
		Collections.sort(itemsOrdered,comparator);
		for (media media : itemsOrdered) {
            System.out.println(media);
        }
		System.out.println("\n");
	}
	public void displayCart() {
		for(media Media : itemsOrdered) {
			System.out.println(Media.toString());
			
		}
	}
	public DigitalVideoDisc creatDVDFromInput() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the info of DVD:");
		System.out.println("id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("title :");
		String title = sc.nextLine();
		System.out.println("category:");
		String category = sc.nextLine();
		System.out.println("cost:");
		float cost = sc.nextFloat();
		sc.nextLine();
		System.out.println("length:");
		float length = sc.nextFloat();
		sc.nextLine();
		System.out.println("director:");
		String ditector =sc.nextLine();
		return new DigitalVideoDisc(id, title, category,cost,length,ditector);
	}
	public book creatBookFromInput() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the info of book:");
		System.out.println("id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("title :");
		String title = sc.nextLine();
		System.out.println("category:");
		String category = sc.nextLine();
		System.out.println("cost:");
		float cost = sc.nextFloat();
		sc.nextLine();
		System.out.println("List of author(Enter 0 to end)");
		ArrayList<String>listAuthor = new ArrayList<>();
		String Author;
		do{
			Author = sc.nextLine();
			if(!Author.equals("0")) {
			listAuthor.add(Author);
			}
		}while(!Author.equals("0"));
		return new book(id, title, category, cost, listAuthor);
		
	}
	public CompactDisc creatCDFromInput() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the info of DVD:");
		System.out.println("id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("title :");
		String title = sc.nextLine();
		System.out.println("category:");
		String category = sc.nextLine();
		System.out.println("cost:");
		float cost = sc.nextFloat();
		sc.nextLine();
		System.out.println("length:");
		float length = sc.nextFloat();
		sc.nextLine();
		System.out.println("director:");
		String ditector =sc.nextLine();
		System.out.println("artist:");
		String artist =sc.nextLine();
		System.out.println("List of track :");
		ArrayList<track>listTrack = new ArrayList<>();
		String titleTrack;
		do {
			System.out.println("title :");
			titleTrack = sc.nextLine();
			if(!titleTrack.equals("0")) {
			System.out.println("length:");
			int lengthTrack = sc.nextInt();
			sc.nextLine();
			
			listTrack.add(new track(titleTrack, lengthTrack));
			}
		}while(!titleTrack.equals("0"));
		
		return new CompactDisc(id, title, category, cost, length, ditector, artist, listTrack);
		
		
	}
//	//Print the list of ordered items of a cart
//	public void print() {
//		System.out.println("\n*********************************CART*******************************\n\nOrder Items : 	");
//		for(DigitalVideoDisc dvd : itemsOrdered) {
//			if(dvd != null){
//				System.out.println(dvd);
//				
//		}
//		}
//		System.out.println("Total cost : [" + totalCost()+ "]");
//		System.out.println("**************************************************************************");
//		
//	}
//	//Search for DVDs in the cart by ID
//	public void searchbyId(int id) {
//		int result = 0;
//		for(DigitalVideoDisc dvd : itemsOrdered) {
//			if(dvd !=  null && dvd.getid() == id) {
//				System.out.println("Result : ");
//				System.out.println(dvd);
//				result++;
//			}
//		}
//			if(result == 0 ){
//				System.out.println("No results were found !");
//			}
//		
//	}
//	//Search for DVDs in the cart by Title
//		public void searchbyTitle(String title) {
//			int result = 0;
//			for(DigitalVideoDisc dvd : itemsOrdered) {
//				if(dvd != null && dvd.getTitle().equals(title)) {
//					System.out.println("Result : ");
//					System.out.println(dvd);
//					result++;
//				}
//			}
//				if(result == 0 ){
//					System.out.println("No results were found !");
//				}
//			
//	}


}


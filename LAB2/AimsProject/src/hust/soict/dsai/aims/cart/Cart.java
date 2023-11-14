package hust.soict.dsai.aims.cart;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	// Generate getter and setter
	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	//Check the number of DVDs in the cart
	public int currentOrdered() {
		int count  = 0; 
		for( int i = 0 ; i < MAX_NUMBERS_ORDERED; i++) {
			if(itemsOrdered[i] != null ) {
				count++;
			}
		}
		return count;
	}
	
	//Displays DVD list
	public void displayCart() {
		for(DigitalVideoDisc disc : itemsOrdered) {
			 if(disc != null) {
			 System.out.println(disc);
			 System.out.println("\n");
			 }
		}
	}
	
	//Add DVD to cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		int maxOrdered = currentOrdered();
		if(maxOrdered ==  MAX_NUMBERS_ORDERED) {
			System.out.println("\nCan't add this DVD, your cart is full!");
		}else {
			itemsOrdered[maxOrdered] = disc;
			System.out.println("\nThis "+ disc.getTitle() + " add successfull");
		}
	}
	//Add list of DVD
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		int maxOrdered = currentOrdered();
		if(maxOrdered ==  MAX_NUMBERS_ORDERED) {
			System.out.println("\nCan't add this DVD, your cart is full!");
		}else {
			for(int i = 0; i < dvdList.length ; i++){
				if(currentOrdered() == MAX_NUMBERS_ORDERED) {
					break;
				}else
					itemsOrdered[maxOrdered + i] = dvdList[i];
					System.out.println("\nThis "+ dvdList[i].getTitle() + " add successfull");
		}
	}
	}
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
	//Add two DVD
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		int maxOrdered = currentOrdered();
		if(maxOrdered ==  MAX_NUMBERS_ORDERED) {
			System.out.println("\nCan't add more DVD, your cart is full!");
		}else {
			itemsOrdered[maxOrdered] = dvd1;
			System.out.println("\nThis "+ dvd1.getTitle() + " add successfull");
			if(currentOrdered() == MAX_NUMBERS_ORDERED ) {
				System.out.println("\nCan't add this dvd2, your cart is full!");
			}else
				itemsOrdered[maxOrdered + 1] = dvd2;
				System.out.println("\nThis "+ dvd2.getTitle() + " add successfull");
				
		}
	}
	
	//Remove DVD from cart
	public void RemoveDigitalVideoDisc(DigitalVideoDisc disc) {
	    int maxOrdered = currentOrdered();
	    int count = -1; 
	    for (int i = 0; i < maxOrdered; i++) {
	        if (itemsOrdered[i] == disc) {
	            count = i;
	            break; 
	        }
	    }
	    if (count == -1) {
	        System.out.println("This " + disc.getTitle() + " is not found");
	    } else {
	        
	        for (int i = count; i < maxOrdered - 1; i++) {
	            itemsOrdered[i] = itemsOrdered[i + 1];
	        }  
	        itemsOrdered[maxOrdered - 1] = null;

	        System.out.println("This " + disc.getTitle() + " has been deleted");
	    }   
	}
	// Sum of cost in cart
	public float totalCost() {
		float totalCost = 0;
		for(int i = 0; i < currentOrdered(); i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	//Print the list of ordered items of a cart
	public void print() {
		System.out.println("\n*********************************CART*******************************\n\nOrder Items : 	");
		for(DigitalVideoDisc dvd : itemsOrdered) {
			if(dvd != null){
				System.out.println(dvd);
				
		}
		}
		System.out.println("Total cost : [" + totalCost()+ "]");
		System.out.println("**************************************************************************");
		
	}
	//Search for DVDs in the cart by ID
	public void searchbyId(int id) {
		int result = 0;
		for(DigitalVideoDisc dvd : itemsOrdered) {
			if(dvd !=  null && dvd.getid() == id) {
				System.out.println("Result : ");
				System.out.println(dvd);
				result++;
			}
		}
			if(result == 0 ){
				System.out.println("No results were found !");
			}
		
	}
	//Search for DVDs in the cart by Title
		public void searchbyTitle(String title) {
			int result = 0;
			for(DigitalVideoDisc dvd : itemsOrdered) {
				if(dvd != null && dvd.getTitle().equals(title)) {
					System.out.println("Result : ");
					System.out.println(dvd);
					result++;
				}
			}
				if(result == 0 ){
					System.out.println("No results were found !");
				}
			
	}
}


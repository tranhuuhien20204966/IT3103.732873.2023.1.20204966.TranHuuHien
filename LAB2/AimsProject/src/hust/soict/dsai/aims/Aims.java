package hust.soict.dsai.aims;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King","Animation", 
				"Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars","Science Fiction",
				"George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(1,"Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//Print total cost of the items in the cart
		
		System.out.println("\nTotal cost is : " + anOrder.totalCost());
		
		//Display DVD list before deletion
		System.out.println(" Your list of DVDs : ");
		anOrder.displayCart();
		
		//Enter the name of the DVD you want to delete
		System.out.println("Enter the name of the DVD you want to remove:");
		Scanner sc = new Scanner(System.in);
		String nameDVD = sc.nextLine();
		//Initialization result
		int result = 0; 
	
		//Check and erase DVD
		for (int i = 0; i < anOrder.currentOrdered(); i++) {
		    if (anOrder.getItemsOrdered()[i].getTitle().equals(nameDVD)) {
		        result = 1;
		        anOrder.RemoveDigitalVideoDisc(anOrder.getItemsOrdered()[i]);
        // Found and deleted DVD, exited the loop
		        break; 
		    }
		}

		if (result == 1) {
		    System.out.println("Deleted successfully!");
		    anOrder.displayCart();
		} else {
		    System.out.println("This DVD was not found!");
		}
}}

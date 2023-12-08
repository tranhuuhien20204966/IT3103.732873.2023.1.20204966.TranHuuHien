package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.vn.aims.media.CompactDisc;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.book;
import hust.soict.vn.aims.media.media;
import hust.soict.vn.aims.media.track;

public class Aims {
	public static void showMenu() {
		System.out.println("          AIMS     ");
		System.out.println("-------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("-----------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("     AIMS - View Store     " );
		System.out.println("---------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("    AIMS - View Store - Media Detail ");
		System.out.println("------------------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("----------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu(){
		System.out.println("    AIMS - See Current Cart ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	public static void main(String[] args) {
		int choice;
		
		Store store = new Store();
		Cart cart= new Cart();
		
		
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
		// View store	
		if(choice == 1) {
			
			System.out.println("List item : \n");
			store.displayItem();
			int choice1;
			do{
				storeMenu();
				choice1 = sc.nextInt();
				sc.nextLine();
				// See a media’s details
				if(choice1 == 1 ) {
					
					int count =0 ;
					System.out.println("Please enter name of media:");
					String nameMedia = sc.nextLine();
					for(media media : store.getItemsInStore()) {
						if(media.getTitle().equals(nameMedia)) {
							count++;
							System.out.println(media.toString());
							int choice5;
							do {
							// media has type book
							if ( media instanceof book) {
								System.out.println("Options:");
								System.out.println("-----------------");
								System.out.println("1. Add to cart");
								System.out.println("0. Back");
								System.out.println("----------------------");
								System.out.println("Please choose a number: 0-1");
								choice5 = sc.nextInt();
							
								sc.nextLine();
								// Add to cart
								if(choice5 == 1) {
									
									cart.addMedia(media);
								}
								
								}
								// media has'n type book
								else {
								mediaDetailsMenu();
								choice5 = sc.nextInt();
								sc.nextLine();
								// Add media to cart
								if(choice5 == 1) {
									
									cart.addMedia(media);
									// Play media
								}else if(choice5 == 2) {
									
									if(media instanceof DigitalVideoDisc){
										((DigitalVideoDisc) media).play();
									}else if(media instanceof CompactDisc) {
										((CompactDisc) media).play();
									}
								}
							
								}
							}while(choice5 != 0);
							}
						
					}
					if(count == 0) {
						System.out.println("This " + nameMedia +" does not exist in Store !");
					}
					// Add a media to cart
				}else if(choice1 == 2) {
					
					int count = 0;
					int countDVD = 0;
					System.out.println("Enter name of media want to add your cart");
					String nameMedia = sc.nextLine();
					for(media media : store.getItemsInStore()) {
						if(media.getTitle().equals(nameMedia)) {
							count++;
							cart.addMedia(media);
							
						}
						if(media instanceof DigitalVideoDisc) {
							countDVD++;
						}
					}
					if(count == 0) {
						System.out.println("This " + nameMedia +" does not exist in Store !");
					}
					System.out.println(" The number of DVDs int the current cart : " + countDVD);
					// Play a media
				}else if( choice1 == 3){
					
					int count = 0;
					System.out.println("Enter name of media want to play");
					String nameMedia = sc.nextLine();
					for(media media : store.getItemsInStore()) {
						if(media.getTitle().equals(nameMedia)) {
							count++;
							if( media instanceof book) {
								System.out.println("Can't play book !");
							}else if(media instanceof DigitalVideoDisc){
								((DigitalVideoDisc) media).play();
							}else if(media instanceof CompactDisc) {
								((CompactDisc) media).play();
							}
						}
					}
					if(count == 0) {
						System.out.println("This " + nameMedia +" does not exist in Store !");
					}
					//See current cart
				}else if(choice1 == 4) {
					
					cart.displayCart();
				}
				
			}while (choice1 != 0);
			//Update store
		}else if( choice == 2) {
			
				System.out.println("Choose the type of media");
				System.out.println("1. DVD");
				System.out.println("2. Book");
				System.out.println("3. CD");
				choice = sc.nextInt();
				sc.nextLine();
				// Update type DVD
				if(choice == 1 ) {
					
					DigitalVideoDisc dvd = cart.creatDVDFromInput();
					System.out.println("you just created\n" + dvd.toString());
					System.out.println("1. Add a media in the store");
					System.out.println("2. Remove a media in the store");
					System.out.println(" Your choice :");
					choice = sc.nextInt();
					sc.nextLine();
					//Add a media in the store
					if( choice == 1) {
						int count =0 ;
						for(media media : store.getItemsInStore()) {
							if(media.getTitle().equals(dvd.getTitle())) {
								count++;
								System.out.println("This DVD "+ dvd.getTitle()+" does exist in store" );
						}
						}
						if(count == 0) {
							store.addMedia(dvd);
							
						}
					// Remove media from store
					}else if( choice == 2) {
						store.removeMedia(dvd);
						System.out.println("Remove successfully !");
					}
					// Update type book
				}else if(choice == 2) {
					
					book Book = cart.creatBookFromInput();
					System.out.println("you just created\n" + Book.toString());
					System.out.println("1. Add a media in the store");
					System.out.println("2. Remove a media in the store");
					System.out.println(" Your choice :");
					choice = sc.nextInt();
					sc.nextLine();
					//Add a media in the store
					if( choice == 1) {
						int count =0 ;
						for(media media : store.getItemsInStore()) {
							if(media.getTitle().equals(Book.getTitle())) {
								count++;
								System.out.println("This book "+ Book.getTitle()+" does exist in store" );
						}
						}
						if(count == 0) {
							store.addMedia(Book);
							
						}
						//Remove a media in the store
					}else if( choice == 2) {
						store.removeMedia(Book);
						System.out.println("Remove successfully !");
					}
					// Update type CD
				}else if(choice == 3) {
					
					CompactDisc cd = cart.creatCDFromInput();
					System.out.println("you just created\n" + cd.toString());
					System.out.println("1. Add a media in the store");
					System.out.println("2. Remove a media in the store");
					System.out.println(" Your choice :");
					choice = sc.nextInt();
					sc.nextLine();
					//Add a media in the store
					if( choice == 1) {
						int count =0 ;
						for(media media : store.getItemsInStore()) {
							if(media.getTitle().equals(cd.getTitle())) {
								count++;
								System.out.println("This CD "+ cd.getTitle()+" does exist in store" );
						}
						}
						if(count == 0) {
							store.addMedia(cd);
							
						}
						//Remove a media in the store
					}else if( choice == 2) {
						store.removeMedia(cd);
						System.out.println("Remove successfully !");
					}
					
				}
				
			// See current cart
		}else if( choice == 3) {
			int choice2;
			do{
			
			cartMenu();
			choice2 = sc.nextInt();
			sc.nextLine();
			//Filter medias in cart
			if(choice2 == 1) {
				
				System.out.println("1. Filter by id");
				System.out.println("2. Filter by id");
				System.out.println("Your option :");
				int choice3 = sc.nextInt();
				sc.nextLine();
				//Filter by id
				if( choice3 == 1) {
					for(media medi : cart.getItemsOrdered()) {
						System.out.println(medi.getId()+"\n");
					}
				//Filter by title
				}else if(choice3 ==2) {
					for(media medi : cart.getItemsOrdered()) {
						System.out.println(medi.getTitle()+"\n");
					}
				}
				//Sort medias in cart
			}else if(choice2 == 2) {
				
				System.out.println("1. Sort by title");
				System.out.println("2. Sort by cost");
				System.out.println("Your option :");
				int choice4 = sc.nextInt();
				sc.nextLine();
				//Sort by title
				if( choice4 == 1) {
					cart.sortByTitleCost();
				//Sort by cost
				}else if(choice4 ==2) {
					cart.sortByCostTitle();
				}
				//Remove media from cart
			}else if(choice2== 3) {
				
				int count = 0;
				System.out.println("Enter name of media want to remove:");
				String nameMedia = sc.nextLine();
				for(media media : store.getItemsInStore()) {
					if(media.getTitle().equals(nameMedia)) {
						count++;
						cart.removeMedia(media);
					}
				}
				if(count == 0) {
					System.out.println("This " + nameMedia +" does not exist in Store !");
				}
				//Play a media
			}else if(choice2 == 4) {
				
				int count = 0;
				System.out.println("Enter name of media want to play");
				String nameMedia = sc.nextLine();
				for(media media : store.getItemsInStore()) {
					if(media.getTitle().equals(nameMedia)) {
						count++;
						if( media instanceof book) {
							System.out.println("Can't play book !");
						}else if(media instanceof DigitalVideoDisc){
							((DigitalVideoDisc) media).play();
						}else if(media instanceof CompactDisc) {
							((CompactDisc) media).play();
						}
					}
				}
				if(count == 0) {
					System.out.println("This " + nameMedia +" does not exist in Store !");
				}
				//Place order
			}else if(choice2 ==5) {
				
				System.out.println("An order is created ");
				cart.getItemsOrdered().clear();
				choice2 = 0;
			}
			}while ( choice2 != 0);
		}}while(choice != 0);
}
}
	


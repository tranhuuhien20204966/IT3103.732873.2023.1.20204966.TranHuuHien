import java.util.Arrays;

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
	
}


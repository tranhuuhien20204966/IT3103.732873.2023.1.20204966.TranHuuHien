package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.media;

public class Store {
    private ArrayList<media> itemsInStore = new ArrayList<>();
    
    
    public ArrayList<media> getItemsInStore() {
		return itemsInStore;
	}


	public void setItemsInStore(ArrayList<media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}


	// Add media
    public void addMedia(media Media){
		int count = 0;
		for(media media : itemsInStore) {
			if(media.equals(Media)) {
				 System.out.println("This media already exist");
				 count++;
		}
		}
			 if(count == 0) {
				 itemsInStore.add(Media);
				 System.out.println("Add "+ Media.getTitle() +" successfully !");
			 }
		}
		
		
	//Remove media from cart
		public void removeMedia(media Media) {
			Iterator<media> iterator = itemsInStore.iterator();
			while(iterator.hasNext()){
				media media = iterator.next();
				if(media.equals(Media)) {
					iterator.remove();
					System.out.println("Remove " + Media.getTitle()+ " successfully!");
				}
			}
		}
		public void displayItem() {
			for(media Media : itemsInStore) {
				System.out.println(Media.toString()+"\n");
			}
		}
//    public void displayItem() {
//        for (DigitalVideoDisc dvd : itemsInStore) {
//            System.out.println(dvd.toString());
//        }
//    }
}

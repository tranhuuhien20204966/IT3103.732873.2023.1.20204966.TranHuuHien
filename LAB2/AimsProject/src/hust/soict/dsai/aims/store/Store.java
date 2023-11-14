package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
    // Add dvds
    public void addDVD(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            itemsInStore.add(dvd);
        }
    }
    // Remove dvd from store
    public void removeDVD(DigitalVideoDisc dvdToRemove) {
        Iterator<DigitalVideoDisc> iterator = itemsInStore.iterator();
        while (iterator.hasNext()) {
            DigitalVideoDisc dvd = iterator.next();
            if (dvd.equals(dvdToRemove)) {
                iterator.remove();
            }
        }
    }

    public void displayItem() {
        for (DigitalVideoDisc dvd : itemsInStore) {
            System.out.println(dvd.toString());
        }
    }
}

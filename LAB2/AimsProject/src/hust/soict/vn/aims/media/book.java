package hust.soict.vn.aims.media;

import java.util.ArrayList;
import java.util.Iterator;

public class book extends media {

	private ArrayList<String>listOfAuthors = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Book : id = " + getId()+" - " + "title = " + getTitle()+ " - " + "category = " + getCategory()
		+ " - " + "cost = " + getCost() + " - "+ "listOfAuthor = " + getListOfAuthors();
	}
	
	

	public book(int id, String title, String category, float cost, ArrayList<String> listOfAuthors) {
		super(id, title, category, cost);
		this.listOfAuthors = listOfAuthors;
	}



	public ArrayList<String> getListOfAuthors() {
		return listOfAuthors;
	}
	public void setListOfAuthors(ArrayList<String> listOfAuthors) {
		this.listOfAuthors = listOfAuthors;
	}
	public void addAuthor(String author) {
		int count = 0;
		for(String auThor : listOfAuthors) {
		 if(auThor.equals(author)) {
			 System.out.println("This author already exist");
			 count++;
		}
		}
		 if(count == 0) {
			 listOfAuthors.add(author);
			 System.out.println("Add "+author+" successfully !");
		 }
	}
	
	
	public void removeAuthor(String author) {
		Iterator<String> iterator = listOfAuthors.iterator();
		while(iterator.hasNext()){
			String auThor = iterator.next();
			if(auThor.equals(author)) {
				iterator.remove();
				System.out.println("Remove " + author+ " successfully!");
			}
		}
	}
	
	
}

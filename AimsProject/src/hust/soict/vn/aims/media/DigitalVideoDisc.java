package hust.soict.vn.aims.media;

public class DigitalVideoDisc extends disc implements Playable{
	private static int nbDigitalVideoDisc = 0;
	
	
	
	
	@Override
	public String toString() {
		return "DVD : id = " + getId()+" - " + "title = " + getTitle()+ " - " + "category = " + getCategory()
		+ " - " + "cost = " + getCost()+ " - " + "length = "+ getLength()+" - "+ "director = "+ getDirector();
	}
	
	
	public DigitalVideoDisc(int id, String title, String category, float cost, float length, String director) {
		super(id, title, category, cost, length, director);
		
	}


	public void play() {
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
	}

//	public DigitalVideoDisc(int id, String title) {
//		this.title = title;
//		this.id =  id;
//		nbDigitalVideoDisc = id;
//	}
//	public DigitalVideoDisc(int id, String title, String category, float cost ) {
//		this.id = id;
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//		nbDigitalVideoDisc = id;
//	}
//	public DigitalVideoDisc(int id , String director, String category, String title, float cost) {
//		this.director = director;
//		this.category = category;
//		this.title = title;
//		this.cost = cost;
//		this.id = id;
//		nbDigitalVideoDisc = id;
//	}
//	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.length = length;
//		this.cost = cost;
//		this.id = id;
//		nbDigitalVideoDisc = id;
//	}
	
	
}

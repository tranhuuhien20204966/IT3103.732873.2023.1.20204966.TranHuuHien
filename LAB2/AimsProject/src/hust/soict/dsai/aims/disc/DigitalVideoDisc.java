package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDisc = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	@Override
	public String toString() {
		return "DVD - [" + title + "] - [" + category + "] - [" + director + "] - ["
				+ length + "] : [" + cost + "] $";
	}
	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(int id, String title) {
		this.title = title;
		this.id =  id;
		nbDigitalVideoDisc = id;
	}
	public DigitalVideoDisc(int id, String title, String category, float cost ) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc = id;
	}
	public DigitalVideoDisc(int id , String director, String category, String title, float cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.id = id;
		nbDigitalVideoDisc = id;
	}
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = id;
		nbDigitalVideoDisc = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getid() {
		return id;
	}
	
}

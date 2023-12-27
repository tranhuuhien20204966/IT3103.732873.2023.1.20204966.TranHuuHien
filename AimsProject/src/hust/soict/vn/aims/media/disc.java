package hust.soict.vn.aims.media;

public class disc extends media {
	private float length;
	private String director;
	public float getLength() {
		
		return length;
	}
	
	public String getDirector() {
		return director;
	}

	public disc(int id, String title, String category, float cost, float length, String director) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}

	
	
	
	
}

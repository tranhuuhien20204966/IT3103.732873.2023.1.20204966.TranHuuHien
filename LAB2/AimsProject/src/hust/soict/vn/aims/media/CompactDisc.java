package hust.soict.vn.aims.media;

import java.util.ArrayList;
import java.util.Iterator;

public class CompactDisc extends disc implements Playable{
	private String artist;
	private ArrayList<track>tracks = new ArrayList<>();
	
	
	
	@Override
	public String toString() {
		return "CD : id = " + getId()+" - " + "title = " + getTitle()+ " - " + "category = " + getCategory()
		+ " - " + "cost = " + getCost()+ " - " + "length = "+ getLength()+" - "+ "director = "+ getDirector()+
		" - " + "artist = " + getArtist()+ " - " + "tracks = " + getTracks();
	}

	
	public CompactDisc(int id, String title, String category, float cost, float length, String director, String artist,
			ArrayList<track> tracks) {
		super(id, title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}


	public String getArtist() {
		return artist;
	}

	private ArrayList<track> getTracks() {
		return tracks;
	}
	
	public void addTrack(track track) {
		int count = 0;
		for(track Track : tracks) {
		 if(Track.equals(track)) {
			 System.out.println("This media already exist");
			 count++;
		}
		}
		 if(count == 0) {
			 tracks.add(track);
			 System.out.println("Add "+track.getTitle()+" successfully !");
		 }
	}
	
	
	public void removeAuthor(track track) {
		Iterator<track> iterator = tracks.iterator();
		while(iterator.hasNext()){
			track Track = iterator.next();
			if(Track.equals(track)) {
				iterator.remove();
				System.out.println("Remove " + track.getTitle()+ " successfully!");
			}
		}
	}
	
	public float sumOfLength(){
		float sum = 0;
		for(track Track : tracks ) {
			sum += Track.getLength();
		}
		return sum;
	}
	public void play() {
		for(track Track : tracks) {
			System.out.println("\n");
			System.out.println("Playing track: "+ Track.getTitle());
			System.out.println("track length: "+ Track.getLength());
			
		}
	}
	
	
	
}

package hust.soict.vn.aims.media;

import java.util.Scanner;

public class track implements Playable {
	private String title;
	private int length;
	
	
	@Override
	public String toString() {
		return "track [title=" + title + ", length=" + length + "]";
	}
	
	public track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	
	public int getLength() {
		return length;
	}
	public void play() {
		System.out.println("Playing track: "+ this.getTitle());
		System.out.println("track length: "+ this.getLength());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		
		}else {
			track Track = (track) obj;
			return title.equals(Track.title) && length == Track.length;
		}
		
	}
	
	
	
	
}


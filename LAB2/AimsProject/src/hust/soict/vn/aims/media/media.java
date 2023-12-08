package hust.soict.vn.aims.media;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;

public class media {
	public static final Comparator<media> COMPARE_BY_TITLE_COST = (Comparator<media>) new MediaComparatorByTitleCost();
	public static final Comparator<media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;
	
	
	@Override
	public String toString() {
		return "media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}
		
	public media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}	
	
	public static Comparator<media> getCompareByTitleCost() {
		return COMPARE_BY_TITLE_COST;
	}
	public static Comparator<media> getCompareByCostTitle() {
		return COMPARE_BY_COST_TITLE;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		
		}else {
			media Media = (media) obj;
			return title.equals(Media.title);
		}
		
	}
	
	
	
}

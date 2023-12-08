package hust.soict.vn.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<media> {
    @Override
    public int compare(media media1, media media2) {
        int titleComparison = Double.compare(media2.getCost(), media1.getCost());
       
        if (titleComparison == 0) {
            return media1.getTitle().compareTo(media2.getTitle());
        }

        return titleComparison;
    }
}



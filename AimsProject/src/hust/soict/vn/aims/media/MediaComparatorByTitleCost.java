package hust.soict.vn.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<media> {
    @Override
    public int compare(media media1, media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
       
        if (titleComparison == 0) {
            return Double.compare(media2.getCost(), media1.getCost());
        }

        return titleComparison;
    }
}

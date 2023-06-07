package media.comparator;
import java.util.Comparator;

import media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        return Comparator.comparingDouble(Media::getCost)
                .thenComparing(Media::getTitle)
                .compare(media1, media2);
    }   
}

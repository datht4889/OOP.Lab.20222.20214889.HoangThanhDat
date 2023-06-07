package media.comparator;
import java.util.Comparator;

import media.Media;
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return Comparator.comparing(Media ::getTitle)
                .thenComparing(Media::getCost)
                .compare(media1, media2);
    }
}

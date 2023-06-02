import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    

    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println(media.getTitle() + " is already exists in Store.");
        } else {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " is  added to Store.");
        }
    }
    
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " removed from Store.");
        } else {
            System.out.println(media.getTitle() + " does not exist in Store.");
        }
    }

    public Media Search(int id){
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }

    public Media Search(String title){
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }

    public void printStore(){
        System.out.println("***********************STORE***********************");
        System.out.println("Media List:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************************");
    }
}

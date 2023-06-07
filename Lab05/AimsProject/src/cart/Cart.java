package cart;
import java.util.ArrayList;

import media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemOrdered = new ArrayList<Media>();

    public ArrayList<Media> getItemOrdered() {
        return itemOrdered;
    }

    public void addMedia(Media media) {
        if (itemOrdered.contains(media)) {
            System.out.println(media.getTitle() + " is already exists in Cart.");
        } else {
            itemOrdered.add(media);
            System.out.println(media.getTitle() + " is  added to Cart.");
        }
    }
    
    public void removeMedia(Media media) {
        if (itemOrdered.contains(media)) {
            itemOrdered.remove(media);
            System.out.println(media.getTitle() + " is removed from Cart.");
        } else {
            System.out.println(media.getTitle() + " does not exist in Cart.");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media media : itemOrdered) {
            sum += media.getCost();
        }
        System.out.println("Total Cost: " + sum);
        return sum;
    }


    public void printOrdered(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemOrdered) {
            System.out.println(media.toString());
        }
        totalCost();
        System.out.println("***************************************************");
    }

    public Media Search(int id){
        for (Media media : itemOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }

    public Media Search(String title){
        for (Media media : itemOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match is found!");
        return null;
    }
}


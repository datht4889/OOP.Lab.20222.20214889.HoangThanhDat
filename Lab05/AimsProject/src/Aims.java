import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import cart.Cart;
import media.*;
import media.book.Book;
import media.disc.CompactDisc;
import media.disc.DigitalVideoDisc;
import screen.ViewStoreScreen;
import store.Store;


public class Aims {
    static Scanner myObj = new Scanner(System.in);
    static Store store = new Store();
    static Cart cart = new Cart();
    public static void main(String args[]) {
        

        CompactDisc cd = new CompactDisc(1, "AlbumName", "Music", "Artist Name", 19);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction","George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", null, 0, 18.99f);
        Book book = new Book(1, "Ala", "Animation", 24.95, new ArrayList<String>());
        Book book2 = new Book(1, "Aladin", "Animation", 25, new ArrayList<String>());
        
        System.out.println(cd.getTitle());
        store.addMedia(cd);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(book);
        store.addMedia(book2);

        // showMenu();

        new ViewStoreScreen(store);
    }



    //Menu
    public static void showMenu(){
        System.out.println("AIMS MENU: ");
        System.out.println("***************************************************");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("***************************************************");
        System.out.println("Please choose a number: 0-1-2-3");
        String option = myObj.nextLine();
        switch (option) {
            case "1":
                storeMenu();
                break;
            case "2":
                updateStore();
                break;
            case "3":
                cart.printOrdered();
                cartMenu();
                break;
            case "0": break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showMenu();
        }
    }

    public static void storeMenu(){
        System.out.println("---------------------------------------------------");
        System.out.println("Store Menu: ");
        System.out.println("***************************************************");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("***************************************************");
        System.out.println("Please choose a number: 0-1-2-3-4");
        String option = myObj.nextLine();
        switch (option) {
            case "1":
                mediaDetailsMenu();
                break;
                
            case "2":
                store.printStore();
                System.out.println("Please enter the title: ");

                String title2 = myObj.nextLine(); 
                Media found2 = store.Search(title2);
                if (found2 instanceof Media){
                    cart.addMedia(found2);
                }
                storeMenu();
                break;
            case "3":
                store.printStore();
                System.out.println("Please enter the title: ");
                String title = myObj.nextLine(); 
                Media found = store.Search(title);
                playMedia(found);
                storeMenu();
                break;
            
            case "4":
                cart.printOrdered();
                cartMenu();
                break;
            case "0": 
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                storeMenu();
                break;
        }

    }

    public static void mediaDetailsMenu(){
        store.printStore();
        System.out.println("Please enter the title: ");
        String title = myObj.nextLine(); 
        Object found = store.Search(title);
        if (found instanceof Media){
            Media found1 = (Media) found;
            mediaDetailsMenu(found1);
        } else{
            mediaDetailsMenu();
        }
    }

    public static void mediaDetailsMenu(Media found){
        System.out.println("---------------------------------------------------");
        System.out.println("Media Details Menu: ");
        System.out.println("***************************************************");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("***************************************************");
        System.out.println("Please choose a number: 0-1-2");

        String option2 = myObj.nextLine();
        switch (option2) {
            case "1":
                cart.addMedia(found);
                mediaDetailsMenu();
                break;
            case "2":
                playMedia(found);
                mediaDetailsMenu(found);
                break;
            case "0":
                storeMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mediaDetailsMenu(found);
                break;
            
        }
        
        
    }
    
    public static void cartMenu(){
        System.out.println("---------------------------------------------------");
        System.out.println("Cart Menu: ");
        System.out.println("***************************************************");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove medias from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("***************************************************");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        String option = myObj.nextLine();
        switch (option) {
            case "1":
                filterOption();
                break;
            case "2":
                sortMedia();
            case "3":
                cart.removeMedia(removeMedia());
            case "4":
                cart.printOrdered();
                System.out.println("Please enter the title: ");
                String title = myObj.nextLine(); 
                Media found = cart.Search(title);
                playMedia(found);

            case "5":
                placeOrder();
            case "0":
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                cartMenu();
                break;            
        }
    }



    // Sort - Search
    public static void sortMedia(){
        System.out.println("---------------------------------------------------");
        System.out.println("Sort Menu: ");
        System.out.println("***************************************************");
        System.out.println("1. Sort by title");
        System.out.println("2. Sort by cost");
        System.out.println("0. Back");
        System.out.println("***************************************************");
        System.out.println("Please choose a number: 0-1-2");

        String option = myObj.nextLine();
        switch (option) {
            case "1":
                Collections.sort(cart.getItemOrdered() , Media.COMPARE_BY_TITLE_COST);
                cart.printOrdered();
                sortMedia();
            case "2":
                Collections.sort(cart.getItemOrdered() , Media.COMPARE_BY_COST_TITLE);
                cart.printOrdered();
                sortMedia();
            case "0":
                cartMenu();
            default:
                System.out.println("Invalid choice. Please try again.");
                sortMedia();
                break; 
        }
    }
    
    public static void filterOption(){
        System.out.println("---------------------------------------------------");
                System.out.println("Filter Options: ");
                System.out.println("***************************************************");
                System.out.println("1. By title");
                System.out.println("2. By id");
                System.out.println("0. Back");
                System.out.println("***************************************************");

                String option1 = myObj.nextLine();
                switch (option1){
                    case "1": 
                        System.out.println("Please enter the title: ");
        
                        String title = myObj.nextLine(); 
                        cart.Search(title);
                        filterOption();
                        break;
                    case "2":
                        System.out.println("Please enter the id: ");
                        String id = myObj.nextLine();
                        cart.Search(Integer.parseInt(id));
                        filterOption();
                        break;
                    case "0":
                        cartMenu();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        filterOption();
                        break; 
                }
    }



    // Update
    public static void updateStore(){
        System.out.println("---------------------------------------------------");
        System.out.println("Update Store: ");
        System.out.println("***************************************************");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back");
        System.out.println("***************************************************");
        System.out.println("Please choose a number: 0-1-2");

        String option = myObj.nextLine();
        switch (option) {
            case "1":
                addMedia();
                break;
            case "2":
                store.removeMedia(removeMedia());
                updateStore();
                break;
            case "0": 
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                updateStore();
                break;
        }
    }
  
    public static Media removeMedia(){
        System.out.println("Please enter the title: ");
        String title = myObj.nextLine(); 
        Object found = store.Search(title);
        if (found instanceof Media){
            Media found1 = (Media) found;
            return found1;
        }
        return null;
    }

    public static void addMedia(){
        System.out.println("---------------------------------------------------");
        System.out.println("Add Media Menu: ");
        System.out.println("***************************************************");
        System.out.println("1. Add a Book to store");
        System.out.println("2. Add a CD to store");
        System.out.println("3. Add a DVD to store");
        System.out.println("0. Back");
        System.out.println("***************************************************");

        String option = myObj.nextLine();
        System.out.println("Please enter the title: ");
        String title = myObj.nextLine();

        if (store.Search(title) instanceof Media){
            System.out.println("Please enter the id: ");
            String id = myObj.nextLine();
            System.out.println("Please enter the category: ");
            String category = myObj.nextLine();
            System.out.println("Please enter the cost: ");
            String cost = myObj.nextLine();
            switch (option) {
                case "1":
                    ArrayList<String> authors = new ArrayList<String>();
                    while (true){
                        System.out.println("Please enter the author: ");
                        String author = myObj.nextLine();
                        authors.add(author);
                        if (author.equals("")){
                            break;
                        }
                    }
                    Book book = new Book(Integer.parseInt(id), option, id, Double.parseDouble(cost), authors);
                    store.addMedia(book);
                    addMedia();
                    break;
                case "2":
                    System.out.println("Please enter the artist: ");
                    String artist = myObj.nextLine();
                    CompactDisc cd = new CompactDisc(Integer.parseInt(id), title, category, artist, Double.parseDouble(cost));
                    store.addMedia(cd);
                    addMedia();
                    break;
                case "3":
                    System.out.println("Please enter the director: ");
                    String director = myObj.nextLine();
                    System.out.println("Please enter the length: ");
                    String length = myObj.nextLine();
                    DigitalVideoDisc dvd = new DigitalVideoDisc(Integer.parseInt(id), title, category, director, Integer.parseInt(length), Double.parseDouble(cost));
                    store.addMedia(dvd);
                    addMedia();
                    break;
                case "0":
                    showMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    addMedia();
                    break;            
            }
        } 

        addMedia();
    }



    // Feature
    public static void playMedia(Media found){
        if (found instanceof CompactDisc){
            CompactDisc found_CD = (CompactDisc) found;
            found_CD.play();
        } else if (found instanceof DigitalVideoDisc){
            DigitalVideoDisc found_DVD = (DigitalVideoDisc) found;
            found_DVD.play();
        } else{
            System.out.println("Cannot play the chosen media.");
        }
    }

    public static void placeOrder(){
        System.out.println("---------------------------------------------------");
        System.out.println("Place Order:");
        cart.printOrdered();
        System.out.println("Order Successfully!");
        System.out.println("---------------------------------------------------");
    }
}


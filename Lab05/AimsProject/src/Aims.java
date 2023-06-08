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
        

        CompactDisc cd = new CompactDisc(1, "Glory Man United", "Music", "Artist Name", 19);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction","George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", null, 0, 18.99);
        Book book = new Book(1, "Aladin", "Animation", 24.95, new ArrayList<String>());
        Book book2 = new Book(1, "Harry Potter", "Fantasy", 25, new ArrayList<String>());
        Book book3 = new Book(1, "Harry Maguire", "Fantasy", 25, new ArrayList<String>());
        Book book4 = new Book(1, "Hairy Potter", "Fantasy", 25, new ArrayList<String>());
        Book book5 = new Book(1, "SIU", "Fantasy", 25, new ArrayList<String>());
        
        store.addMedia(cd);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(book);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);
        store.addMedia(book5);

        ViewStoreScreen screen = new ViewStoreScreen(store, cart);
    }

}


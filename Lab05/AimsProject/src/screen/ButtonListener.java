package screen;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import cart.Cart;
import media.Media;
import media.disc.Disc;
import store.Store;

public class ButtonListener implements ActionListener{
    private Store store;
    private Cart cart;
    private Media media;

    public ButtonListener(){
        
    }

    public ButtonListener(Store store){
        this.store = store;
    }

    public ButtonListener(Cart cart){
        this.cart = cart;
    }

    public ButtonListener(Media media){
        this.media = media;
    }

    public void actionPerformed (ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("View cart")) {
            JDialog viewCartDialog = new JDialog();
            // viewCartDialog.setLayout(new ());
            viewCartDialog.setTitle("Current Cart");

            // center.setLayout(new GridLayout(3, 3, 2, 2));

            // ArrayList<Media> mediaInStore = store.getItemsInStore();
            // for (Media media : mediaInStore) {
            //     MediaStore cell = new MediaStore(media);
            //     center.add(cell);
            // }

            // ArrayList<Media> mediaInCart = cart.getItemOrdered();
            // for (Media media : mediaInCart) {
            //     MediaStore cell = new MediaStore(media);
            //     center.add(cell);
            // }

            DefaultTableModel bookTableModel;
            bookTableModel = new DefaultTableModel();
            bookTableModel.addColumn("Title");
            bookTableModel.addColumn("Author");
            bookTableModel.addColumn("Price");
            JTable bookTable;
            bookTable = new JTable(bookTableModel);
            JScrollPane tableScrollPane = new JScrollPane(bookTable);

            JButton addButton = new JButton("Add Book");
            JButton removeButton = new JButton("Remove Book");

            addButton.addActionListener(this);
            removeButton.addActionListener(this);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());
            buttonPanel.add(addButton);
            buttonPanel.add(removeButton);

            viewCartDialog.add(tableScrollPane, BorderLayout.CENTER);
            viewCartDialog.add(buttonPanel, BorderLayout.SOUTH);

            viewCartDialog.setSize(500, 500);
            viewCartDialog.setVisible(true);
            viewCartDialog.setLocationRelativeTo(null);
        } else if (s.equals("Play")){
            JDialog playDialog = new JDialog();
            Disc disc = (Disc) media;
            JLabel l = new JLabel("Playing " + disc.getTitle() + " " + disc.getLength() +"s");
            playDialog.add(l);
            
            playDialog.setSize(300, 100);
            playDialog.setVisible(true);
            playDialog.setLocationRelativeTo(null);
        } else if (s.equals("Add to cart")){
            JDialog d = new JDialog();
            JLabel l = new JLabel("Add " + media.getTitle() +" to cart successfully!");
            d.add(l);        
            
            d.setSize(500, 100);
            d.setVisible(true);
            d.setLocationRelativeTo(null);
            cart.addMedia(this.media);
            
        } 

    }
}

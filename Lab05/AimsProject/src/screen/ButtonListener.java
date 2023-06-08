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

    public ButtonListener(Media media, Cart cart){
        this.media = media;
        this.cart = cart;
    }

    public void actionPerformed (ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("View cart")) {
            JDialog viewCartDialog = new JDialog();
            viewCartDialog.setLayout(new BorderLayout());
            viewCartDialog.setTitle("Current Cart");

            JPanel center = new JPanel();
            center.setLayout(new GridLayout(3, 3, 2, 2));

            ArrayList<Media> mediaInCart = cart.getItemOrdered();
            for (Media media : mediaInCart) {
                MediaCart cell = new MediaCart(media, cart);
                center.add(cell);
            }

            JLabel totalCost = new JLabel("Total Price: "+cart.totalCost()+"$");
            totalCost.setFont(new Font(totalCost.getFont().getName(), Font.PLAIN, 30));
            totalCost.setForeground(Color.black);
            
            viewCartDialog.add(center, BorderLayout.CENTER);
            viewCartDialog.add(totalCost, BorderLayout.SOUTH);
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
            
            this.cart.addMedia(this.media);

            d.setSize(500, 100);
            d.setVisible(true);
            d.setLocationRelativeTo(null);

        } else if (s.equals("Remove from cart")){
            JDialog d = new JDialog();
            JLabel l = new JLabel("Remove " + media.getTitle() +" successfully!");
            d.add(l);        
            
            this.cart.removeMedia(this.media);

            d.setSize(500, 100);
            d.setVisible(true);
            d.setLocationRelativeTo(null);

        }

    }
}

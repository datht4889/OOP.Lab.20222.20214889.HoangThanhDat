package screen;
import javax.swing.*;

import cart.Cart;
import media.Media;
import store.Store;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ViewStoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public ViewStoreScreen(Store store, Cart cart) {
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu option = new JMenu("Options");
        JMenu updateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        updateStore.add(addBook);
        // addBook.addActionListener(new ButtonListener());

        JMenuItem addCD = new JMenuItem("Add CD");
        updateStore.add(addCD);
        // addCD.addActionListener(new ButtonListener());

        JMenuItem addDVD = new JMenuItem("Add DVD");
        updateStore.add(addDVD);
        // addDVD.addActionListener(new ButtonListener());

        option.add(updateStore);

        JMenuItem viewStore = new JMenuItem("View store");
        option.add(viewStore);
        // addDVD.addActionListener(new ButtonListener(store));

        JMenuItem viewCart = new JMenuItem("View cart");
        option.add(viewCart);
        // addDVD.addActionListener(new ButtonListener(this.cart));


        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(option);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton viewCart = new JButton("View cart");
        viewCart.setPreferredSize(new Dimension(100, 50));
        viewCart.setMaximumSize(new Dimension(100, 50));
        viewCart.addActionListener(new ButtonListener(cart));

        header.add(Box.createRigidArea(new Dimension(100, 50)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(viewCart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media, cart);
            center.add(cell);
        }
        return center;
        
    }
    
}

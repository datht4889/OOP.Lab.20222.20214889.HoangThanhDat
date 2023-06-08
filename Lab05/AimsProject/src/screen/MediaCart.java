package screen;
import javax.swing.*;

import cart.Cart;
import media.Media;
import media.disc.Playable;

import java.awt.*;

public class MediaCart extends JPanel{
    private Cart cart;
    private Media media;
    public MediaCart(Media media, Cart cart) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton removeFromCart = new JButton("Remove from cart");
        removeFromCart.addActionListener(new ButtonListener(media, cart));
        container.add(removeFromCart);

        if (media instanceof Playable){
            JButton play = new JButton("Play");
            play.addActionListener(new ButtonListener(media));
            container.add(play);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
}

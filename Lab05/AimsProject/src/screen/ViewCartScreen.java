package screen;
import javax.swing.*;

import media.Media;
import store.Store;

import java.awt.*;
import java.util.ArrayList;

public class ViewCartScreen extends JDialog {

    public ViewCartScreen() {
        JPanel x = new JPanel();

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.setLayout(new BoxLayout(x, BoxLayout.Y_AXIS));
        cp.add(new Label("test"));

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

}

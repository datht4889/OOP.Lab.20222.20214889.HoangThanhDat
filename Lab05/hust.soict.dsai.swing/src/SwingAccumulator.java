import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;

    public SwingAccumulator () {
        JFrame cp = new JFrame();

        cp.setLayout (new GridLayout (2, 2));

        cp.add (new JLabel("Enter an Integer: "));

        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        cp.add (new JLabel("The Accumulated Sum is: "));

        tfOutput = new JTextField(10);
        tfOutput.setEditable(false);
        cp.add (tfOutput);

        cp.setTitle ("Swing Accumulator");
        cp.setSize(350, 120);
        cp.setVisible(true);
    }

    public static void main (String[] args) {
        new SwingAccumulator () ;
    }
    
    private class TFInputListener implements ActionListener {

        public void actionPerformed (ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText () );
            sum += numberIn;
            tfInput.setText ("");
            tfOutput.setText (sum + "");
        }
    }
}
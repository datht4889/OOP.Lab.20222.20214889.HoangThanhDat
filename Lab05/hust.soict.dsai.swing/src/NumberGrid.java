import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGrid extends JFrame{
    private JButton[] btnNum = new JButton[10];
    private JButton btnDel, btnReset;
    private JTextField tfDisplay;

    public static void main (String args[]){
        new NumberGrid();
    }

    public NumberGrid(){
        tfDisplay = new JTextField();
        tfDisplay.setSize(200, 80);
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        JPanel panelButton = new JPanel(new GridLayout(4, 3));

        addButtons(panelButton);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButton, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);

    }

    void addButtons(JPanel panelButton){
        ButtonListener btnListener = new ButtonListener();
        for (int i = 1; i<= 9; i++) {
            btnNum[i] = new JButton(""+i);
            panelButton.add(btnNum[i]);
            btnNum[i].addActionListener(btnListener);
        }

        btnDel = new JButton("DEL");
        panelButton.add(btnDel);
        btnDel.addActionListener(btnListener);

        btnNum[0] = new JButton("0");
        panelButton.add(btnNum[0]);
        btnNum[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButton.add(btnReset);
        btnReset.addActionListener(btnListener);
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <= '9'){
                tfDisplay.setText(tfDisplay.getText() + button);
            } else if (button.equals("DEL")){
                tfDisplay.setText(tfDisplay.getText().substring(0, tfDisplay.getText().length() - 1));
            } else{
                tfDisplay.setText("");
            }
        }
    }
}

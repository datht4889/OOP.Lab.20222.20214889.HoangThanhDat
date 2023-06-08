import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookShopGUI extends JFrame implements ActionListener {
    private DefaultTableModel bookTableModel;
    private JTable bookTable;
    private JButton addButton;
    private JButton removeButton;

    public BookShopGUI() {
        setTitle("Book Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        bookTableModel = new DefaultTableModel();
        bookTableModel.addColumn("Title");
        bookTableModel.addColumn("Author");
        bookTableModel.addColumn("Price");

        bookTable = new JTable(bookTableModel);
        JScrollPane tableScrollPane = new JScrollPane(bookTable);

        addButton = new JButton("Add Book");
        removeButton = new JButton("Remove Book");

        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        add(tableScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            BookDialog bookDialog = new BookDialog(this);
            if (bookDialog.isBookAdded()) {
                String[] bookData = bookDialog.getBookData();
                bookTableModel.addRow(bookData);
            }
        } else if (e.getSource() == removeButton) {
            int selectedRow = bookTable.getSelectedRow();
            if (selectedRow != -1) {
                bookTableModel.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "No book selected.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BookShopGUI();
        });
    }
}

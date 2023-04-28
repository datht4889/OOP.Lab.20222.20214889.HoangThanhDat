import javax.swing.JOptionPane;

public class Math {
    public static void main(String[] args){
        String strNum1, strNum2;
        String sum = "Sum: ", diff = "Difference: ", product = "Product:", quotient = "Quotient: ";

        strNum1 = JOptionPane.showInputDialog(null, "Pleas input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Pleas input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        sum += (num1 + num2);
        diff += (num1 - num2);
        product += (num1*num2);
        quotient += (num1/num2);

        String result = sum + "\n" + diff + "\n" + product + "\n" + quotient;

        JOptionPane.showMessageDialog(null, result, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

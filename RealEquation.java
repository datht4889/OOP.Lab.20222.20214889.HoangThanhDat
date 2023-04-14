
import java.util.Scanner;

public class RealEquation {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose the type of the equations\n1. First degree equation.\n2.System of first-degree equations.");
        int degree = myObj.nextInt();

        if (degree == 1){
            System.out.println("Enter the first coefficient");
            double a = myObj.nextInt();
            System.out.println("Enter the second coefficient");
            double b = myObj.nextInt();
            double root = -b/a;
    
            if (a == 0) {
                if (b == 0){
                    System.out.println("The equation has infinite real root.");
                }else{
                    System.out.println("The equation has no real root.");
                }
                
            } else{
                System.out.println("The root of the equation is " + root + ".");
            }
            
        }

        else if (degree == 2) {
            System.out.println("Enter the first coefficient of the first equation: ");
            double a1 = myObj.nextDouble();
            System.out.println("Enter the second coefficient of the first equation: ");
            double b1 = myObj.nextDouble();
            System.out.println("Enter the third coefficient of the first equation: ");
            double c1 = myObj.nextDouble();
            

            System.out.println("Enter the first coefficient of the second equation: ");
            double a2 = myObj.nextDouble();
            System.out.println("Enter the second coefficient of the second equation: ");
            double b2 = myObj.nextDouble();
            System.out.println("Enter the third coefficient of the second equation: ");
            double c2 = myObj.nextDouble();
    

            double D = a1*b2 - a2*b1;
            double Dx = c1*b2 - c2*b1;
            double Dy = a1*c2 - a2*c1;

            if (D == 0 && Dx == 0 && Dy == 0)  {
                System.out.println("The equation has infinite real root.");
            } else if (D ==0 && Dx != 0 && Dy != 0) {
                System.out.println("The equation has no real root.");
            } else {
                System.out.println("The root of the equation is (x, y) = (" + Dx/D + ";" + Dy/D + ").");
            }
        }

        System.exit(0);
    }
}

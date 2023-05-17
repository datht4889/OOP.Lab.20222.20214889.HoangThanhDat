import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = myObj.nextLine();
        System.out.println("How old are you?");
        int age = myObj.nextInt();
        System.out.println("How tall are you (m)?");
        double height = myObj.nextDouble();
        System.out.println("Mrs/Ms " + name + ", " + age + " years old. Your height is " + height + ".");
        System.exit(0);
    }
}
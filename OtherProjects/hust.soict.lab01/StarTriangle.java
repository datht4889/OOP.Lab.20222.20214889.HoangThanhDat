import java.util.Scanner;

public class StarTriangle {
    public static void main(String argrs[]){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        for (int i = 1; i <= n; ++i) {
            int k = 0;
            for (int space = 1; space <= n - i; ++space) {
              System.out.print("  ");
            }
      
            while (k != 2 * i - 1) {
              System.out.print("* ");
              ++k;
            }
      
            System.out.println();
          }
        }
}


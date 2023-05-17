import java.util.Scanner;
import java.util.Arrays; 
public class Array
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array:");
        n = myObj.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = myObj.nextInt();
            sum = sum + a[i];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);

    }
}

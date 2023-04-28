import java.util.Scanner;

public class Matrix {
    public static void main(String args[]){  
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter number of rows you want in array:");
        int m = myObj.nextInt();
        System.out.print("Enter number of columns you want in array:");
        int n = myObj.nextInt();


        int a[][]=new int[m][n];    
        int b[][]=new int[m][n];    
        int c[][]=new int[m][n]; 
        
        System.out.print("Enter elements in first array:");
        for(int i = 0; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                a[i][j] = myObj.nextInt();
            } 
        }

        System.out.print("Enter elements in second array:");
        for(int i = 0; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                b[i][j] = myObj.nextInt();
            } 
        }
   
        for(int i = 0; i < m; i++){    
            for(int j = 0; j < n; j++){    
                c[i][j] = a[i][j] + b[i][j];    
        System.out.print(c[i][j]+" ");    
        }    
        System.out.println();
        }    
        }
}

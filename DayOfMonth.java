import java.util.Scanner;
public class DayOfMonth {

  public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 

        System.out.print("Input a month number: ");
        int month = myObj.nextInt();

        System.out.print("Input a year: ");
        int year = myObj.nextInt();

        
        if  (month == 1) {
            number_Of_DaysInMonth = 31;
        } 
        
        else if (month == 2){
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                number_Of_DaysInMonth = 29;
            } else {
                number_Of_DaysInMonth = 28;
            }
        } 
        
        else if  (month == 3) {
            number_Of_DaysInMonth = 31;
        }


        else if  (month == 4) {
            number_Of_DaysInMonth = 30;
        }


        else if  (month == 5) {
            number_Of_DaysInMonth = 31;
        }


        else if  (month == 6) {
            number_Of_DaysInMonth = 30;
        }

        else if  (month == 7) {
            number_Of_DaysInMonth = 31;
        }

        else if  (month == 8) {
            number_Of_DaysInMonth = 31;
        }

        else if  (month == 9) {
            number_Of_DaysInMonth = 30;
        }

        else if  (month == 10) {
            number_Of_DaysInMonth = 31;
        }

        else if  (month == 11) {
            number_Of_DaysInMonth = 30;
        }

        else if  (month == 12) {
            number_Of_DaysInMonth = 31;
        }

        
        System.out.print(number_Of_DaysInMonth);
    }
}

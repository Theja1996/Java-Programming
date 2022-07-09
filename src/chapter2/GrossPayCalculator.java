package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
     public static void main(String[] args) {

         //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
         Scanner scanner = new Scanner(System.in);
         int hours = scanner.nextInt();

         //2. Get the hourly pay rate
         System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();


         //3. Multiply hours and pay rate
         double grossPay = hours * rate;

         //4. Display result
         System.out.println("The employee's gross pay is $" + grossPay);

         String adjective = scanner.next();
         String season = scanner.next();
         int cups = scanner.nextInt();
         scanner.close();

         // Mad Libs
    System.out.println("On a" + " " + adjective +" " +  season + " day, I drink a minimum number  of " + cups + " cup of coffee");
    }
}

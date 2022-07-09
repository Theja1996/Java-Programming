package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {
     public static void main(String[] args) {
         //Initialize known values
         int payment = 1000;
         int bonus = 250;
         int quota = 10;

// unknown values
         System.out.println("How many  sales by salespeople");
         Scanner scanner = new Scanner(System.in);
         int sales = scanner.nextInt();

         //output

         if(sales>quota){
             payment  = payment+bonus;
         }

         System.out.println("Saleperson salary $" + payment);
    }
}

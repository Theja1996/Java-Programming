package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args) {

        //Initialized known data
        int quota = 10;

System.out.println("How many sakes make per week by salesperson");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        int gap = quota-sales;

        if(sales>=quota){
System.out.println("congratualtions");
        }
else {
    System.out.println("You should need more  " +gap+" sales to success");
        }


    }
}

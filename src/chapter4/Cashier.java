package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {




        System.out.println("How many items buy");
        Scanner scanner = new Scanner(System.in);
        int qut = scanner.nextInt();
        double total = 0;

        for (int i=0;i<qut;i++){
System.out.println("cost of item");
double prize = scanner.nextDouble();

            total = total+prize;
        }
        scanner.close();
        System.out.println("Total is $" + total);
    }
}

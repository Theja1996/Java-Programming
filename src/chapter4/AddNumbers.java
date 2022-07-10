package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {
    public static void main(String[] args) {

        boolean again;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter first number");
            int firstNum = scanner.nextInt();

            System.out.println("Enter Second Number");
            int secondNum = scanner.nextInt();

            int sum = firstNum+secondNum;
System.out.println("Sum is "+ sum);

System.out.println("would you like to start over? true or false");
again = scanner.nextBoolean();

        }while (again);
scanner.close();
    }
}

package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {

        //Initialized known values
        int rate = 15;
        int maxHours = 40;

        System.out.println("how many hours are waork per week");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//validate inputs
        while (hours < 1 || hours>maxHours){
            System.out.println("Invalied inpt");
            hours = scanner.nextInt();
        }
        scanner.close();
int salary = rate*hours;
        System.out.println("Employee monthly salary $" + salary);
    }
}

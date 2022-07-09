package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Grade of student");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;


        switch (grade){
            case "A":
                message = "exellent";
                         break;
            case "B":
                message = "Good";
                break;
            case "C":
                message  = "normal";
                break;
            default:
                message = "bad";break;
        }
        System.out.println(message);
    }
}

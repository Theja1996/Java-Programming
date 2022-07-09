package chapter3;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
public class TestResult {
    public static void main(String[] args) {
        //Initalized known values
       

        
        System.out.println("Student test marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        scanner.close();
        char grade;
        if(marks<=35){
           grade = 'F';
        } else if (marks>35 && marks<=55) {
            grade = 'C';
        } else if (marks>55 && marks<75) {
            grade = 'B';
        }else {
            grade = 'A';
        }
        System.out.println("Grade is" + grade);
    }

}

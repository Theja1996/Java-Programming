package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
         System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greeting(name);
    }

    public static void greeting(String name){
        System.out.println("Hi there, "+ name);
    }
}

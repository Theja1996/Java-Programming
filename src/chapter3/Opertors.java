package chapter3;

import java.util.Scanner;

public class Opertors {
    public static void main(String[] args) {
        //Initial known values
        int loan = 30000;
        int service = 2;

        System.out.println("Loan size a person that needed");
        Scanner scanner = new Scanner(System.in);
        int loan_value = scanner.nextInt();
        System.out.println("how may years working experiance that person  have");
        int job_service = scanner.nextInt();
        scanner.close();

        if(loan_value>=loan && job_service>=service){

                System.out.println("Qualified for loan");




        }
        else {
            System.out.println("not Qualified");
        }



    }
}

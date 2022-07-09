package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
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

        if(loan_value>=loan){
            if (job_service>=service){
                System.out.println("Qualified for loan");
            }
            else {
                System.out.println("requied minimum 2 years service experiance");
            }

        }
else {
    System.out.println("not sufficient value to request");
        }


    }
}

package chapter7;

import java.util.Random;

public class LottoryTicket {
    private static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {
int[] ticket =   generateNumber();
printTicket(ticket);
    }
    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i =0; i<LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER)+1;
        }
        return ticket;
    }

    /***
     * javaDoc comment
     * @param ticket
     */
    public static void printTicket(int ticket[]){
        for (int i=0;i<LENGTH;i++){
            System.out.print(ticket[i] + "  ");
        }
    }
}

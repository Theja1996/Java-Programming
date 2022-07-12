package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
         Rectangle bedRoom = calculator.getRoom();
         Rectangle bathroom  = calculator.getRoom();

         double AreaCalculator = calculator.calculatorTotalArea(bedRoom,bathroom);
         System.out.println("Area is " + AreaCalculator);
       calculator.scanner.close();
    }
    public Rectangle getRoom(){


        System.out.println("enter length " );
        double length = scanner.nextDouble();

        System.out.println("enter width");
        double width = scanner.nextDouble();


        return new Rectangle(length,width);
    }

    public double calculatorTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return  rectangle1.calculateArea() + rectangle2.calculateArea() ;
    }
}

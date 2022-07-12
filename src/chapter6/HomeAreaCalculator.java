package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        //room1
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double AreaRoom1 = room1.calculateArea();

        //room2
        Rectangle room2 = new Rectangle(30,15);
        double AreaRoom2 = room2.calculateArea();

        double TotalArea = AreaRoom1+AreaRoom2;
        System.out.println("Home area " + TotalArea);
    }
}

package TAUcourse.asd.Chapter6;
/*
Write a class that creates instances of the rectangle class to find the
total area of two room in a house.
 */
public class HomeAreaCalculator {

    public static void main(String args[]){

        /************************
         * RECTANGLE
         **************************/

        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLenght(50);
        double areaOfRoom1 = room1.calculateArea();

        /************************
         * RECTANGLE 2
         **************************/

        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30,75);
        Double areaOfroom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfroom2;

        System.out.println("ARea of both room: " + totalArea);
    }
}

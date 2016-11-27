import Shapes.Square;
import Shapes.Rectangle;
import Utils.Math;

public class Driver {

    public static void main(String[] args) {

        Square mySquare=new Square(100);
        System.out.println("The area of the square is "+mySquare.getArea());


        Rectangle myRectangle = new Rectangle(50,80);
        System.out.println("The area of the rectangle is "+myRectangle.getArea());


        double factNum=15.6;
        
        System.out.println("FactorialRecursive: "+Math.factorial( (int)factNum) );
        System.out.println("FactorialLoop: "+Math.factorialLoop( (int)factNum) );

    }
}
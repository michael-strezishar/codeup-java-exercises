package shapes;
import java.util.Scanner;
import shapes.Rectangle;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());


//        Rectangle rect = new Rectangle(5, 6);
//        System.out.println(rect.getArea());
//        System.out.println(rect.getPerimeter());


    }


}

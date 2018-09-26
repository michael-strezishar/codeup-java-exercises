package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }
//
//    public void setLength(double length) {
//        this.length = length;
//        this.width = length;
//    }
//
//
//    public void setWidth(double width) {
//        this.width = width;
//        this.length = width;
//    }
    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea(){
        return length * length;
    }
//
//    public double getArea() {
//        return Math.pow(this.length, 2);
//    }
}



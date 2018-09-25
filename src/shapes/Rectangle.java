package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

        public int getLength () {
            return length;
        }

        public int getWidth () {
            return width;
        }




//        public void setLength(double length){
//        this.length = length;
//    }


//    public void setWidth(double width){
//        this.width = width;
//    }
//
    public int getPerimeter(){
        return (this.length + this.width) * 2;
    }

    public int getArea(){
        return this.length * this.width;
    }


}

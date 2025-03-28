public class Circle  extend shape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        super(center) ;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            throw new IllegalArgumentException("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    public int area (){
        return Math .PI*radius*radius;

    }


    public
}

package lab5;

public class Circle {
    Point A;
    Point B;

    public Circle(Point a, Point b){
        this.A = a;
        this.B = b;
    }
    public double perimeter(){
        return 2 * A.distance(B) * Math.PI;
    }

    public double area(){
        return Math.pow(A.distance(B),2) * Math.PI;
    }
    

}


package lab4;

import java.util.Objects;

public class Rectangle {
  Point startPoint;
  double x_length, y_length;

  Rectangle(Point startPoint, double x_length, double y_length) throws IllegalArgumentException {
    this.startPoint = Objects.requireNonNull(startPoint, "Starting point cannot be null");

    if (x_length < 0 || y_length < 0)
      throw new IllegalArgumentException("Rectangle cannot have negative dimensions!!");

    this.startPoint = startPoint;
    this.x_length = x_length;
    this.y_length = y_length;
  }

  public double perimeter() {
    return 2*x_length + 2*y_length;
  }

  public double area() {
    return x_length * y_length;
  }

  public double diagonal() {
    return Math.sqrt(Math.pow(x_length, 2) + Math.pow(y_length, 2));
  }

  public Point[] vertices() {
    Point v2 = new Point(startPoint.x, startPoint.y + y_length);
    Point v3 = new Point(startPoint.x + x_length, startPoint.y);
    Point v4 = new Point(startPoint.x + x_length, startPoint.y + y_length);
    return new Point[] {startPoint, v2, v3, v4};
  }
}

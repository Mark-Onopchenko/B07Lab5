package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
	@Test
	void testConstructor()
	{
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,1);
		Circle c = new Circle(p1,p2);
		assertEquals(c.A, p1);
		assertEquals(c.B, p2);
	}
	
	@Test
	void testPerimeter() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,1);
		Circle c = new Circle(p1,p2);
		assertEquals(c.perimeter(), 2 * Math.PI);
	}
	
	@Test
	void testArea() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,1);
		Circle c = new Circle(p1,p2);
		assertEquals(c.area(), Math.PI);
	}
}

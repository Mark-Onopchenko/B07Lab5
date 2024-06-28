package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest2 {

	@Test
	void testPerimeter() {
		Point p = new Point(0,0);
		Rectangle r = new Rectangle(p,2,3);
		assertEquals(r.perimeter(),10);
	}
	
	@Test
	void testArea() {
		Point p = new Point(0,0);
		Rectangle r = new Rectangle(p,2,3);
		assertEquals(r.area(),6);
	}
	
	@Test
	void testDiagonal() {
		Point p = new Point(0,0);
		Rectangle r = new Rectangle(p,3,4);
		assertEquals(r.diagonal(),5);
	}

}

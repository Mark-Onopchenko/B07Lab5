package lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testRectangleConstructor() {
        Point startPoint = new Point(0, 0);
        Rectangle rectangle = new Rectangle(startPoint, 5, 10);
        
        assertNotNull(rectangle);
        assertEquals(startPoint, rectangle.startPoint);
        assertEquals(5, rectangle.x_length);
        assertEquals(10, rectangle.y_length);
    }

    @Test
    void testRectangleConstructorNullStartPoint() {
        assertThrows(NullPointerException.class, () -> {
            new Rectangle(null, 5, 10);
        });
    }

    @Test
    void testRectangleConstructorNegativeXLength() {
        Point startPoint = new Point(0, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(startPoint, -5, 10);
        });
    }

    @Test
    void testRectangleConstructorNegativeYLength() {
        Point startPoint = new Point(0, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(startPoint, 5, -10);
        });
    }

    @Test
    void testVertices() {
        Point startPoint = new Point(1, 2);
        Rectangle rectangle = new Rectangle(startPoint, 5, 3);
        Point[] vertices = rectangle.vertices();
        
        assertEquals(4, vertices.length);
        assertEquals(new Point(1, 2), vertices[0]);
        assertEquals(new Point(1, 5), vertices[1]);
        assertEquals(new Point(6, 2), vertices[2]);
        assertEquals(new Point(6, 5), vertices[3]);
    }

    @Test
    void testVerticesZeroSize() {
        Point startPoint = new Point(0, 0);
        Rectangle rectangle = new Rectangle(startPoint, 0, 0);
        Point[] vertices = rectangle.vertices();
        
        assertEquals(4, vertices.length);
        assertEquals(new Point(0, 0), vertices[0]);
        assertEquals(new Point(0, 0), vertices[1]);
        assertEquals(new Point(0, 0), vertices[2]);
        assertEquals(new Point(0, 0), vertices[3]);
    }
}

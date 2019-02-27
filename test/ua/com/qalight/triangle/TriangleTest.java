package ua.com.qalight.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.com.qalight.circle.Circle;

public class TriangleTest {

	@Test
	void testGetAreaWithZero() {
		Triangle triangle = new Triangle(0, 0);
		assertNotNull(triangle.getArea());
		assertEquals(0, triangle.getArea());
	}

	@Test
	void testGetAreaWithOne() {
		Triangle triangle = new Triangle(1, 1);
		assertNotNull(triangle.getArea());
		assertEquals(0,5, triangle.getArea());
	}

	@Test
	void testGetAreaWithTen() {
		Triangle triangle = new Triangle(10, 5);
		assertNotNull(triangle.getArea());
		assertEquals(25, triangle.getArea());
	}

}

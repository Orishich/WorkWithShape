package ua.com.qalight.circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.com.qalight.circle.Circle;

public class CircleTest {

	@Test
	void testGetAreaWithZero() {
		Circle circle = new Circle(0);
		assertNotNull(circle.getArea());
		assertEquals(0, circle.getArea());
	}

	@Test
	void testGetAreaWithOne() {
		Circle circle = new Circle(1);
		assertNotNull(circle.getArea());
		assertEquals(1, circle.getArea());
	}

	@Test
	void testGetAreaWithTen() {
		Circle circle = new Circle(10);
		assertNotNull(circle.getArea());
		assertEquals(314, circle.getArea());
	}
}

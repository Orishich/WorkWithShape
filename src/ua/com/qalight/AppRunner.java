package ua.com.qalight;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ua.com.qalight.square.Square;
import ua.com.qalight.abstraction.Shape;
import ua.com.qalight.circle.Circle;
import ua.com.qalight.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();

		Shape square1 = new Square(10);
		Shape square2 = new Square(100);
		Shape square3 = new Square(1000);
		Shape square4 = new Square(10000);

		Shape circle1 = new Circle(10);
		Shape circle2 = new Circle(100);
		Shape circle3 = new Circle(1000);
		Shape circle4 = new Circle(10000);

		shapes.add((Square) square1);
		shapes.add((Square) square2);
		shapes.add((Square) square3);
		shapes.add((Square) square4);

		shapes.add((Circle) circle1);
		shapes.add((Circle) circle2);
		shapes.add((Circle) circle3);
		shapes.add((Circle) circle4);

		Shape triangle1 = new Triangle(10, 5);
		Shape triangle2 = new Triangle(100, 50);
		Shape triangle3 = new Triangle(1000, 500);
		Shape triangle4 = new Triangle(10000, 5000);

		shapes.add((Triangle) triangle1);
		shapes.add((Triangle) triangle2);
		shapes.add((Triangle) triangle3);
		shapes.add((Triangle) triangle4);

		Shape maxShape = shapes.get(0);
		Shape minShape = shapes.get(0);

		for (int i = 0; i < shapes.size(); i++) {

			logger.info("Shape " + shapes.get(i).getClass().getSimpleName() + " has area " + shapes.get(i).getArea());

			if (maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}
		}

		logger.info("Shape " + maxShape.getClass().getSimpleName() + " has area " + maxShape.getArea());

		logger.info("end");

		for (int i = 0; i < shapes.size(); i = i++) {
			logger.info(
					"Square with side " + shapes.getClass().getSimpleName() + " has area " + shapes.get(i).getArea());

			if (minShape.getArea() < shapes.get(i).getArea()) {
				minShape = shapes.get(i);
			}
		}

		logger.info("Shape " + minShape.getClass().getSimpleName() + " has area " + minShape.getArea());

		logger.info("end");
	}

}

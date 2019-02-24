package ua.com.qalight.triangle;

import ua.com.qalight.abstraction.Shape;

public class Triangle implements Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeigth() {
		return height;
	}

	public void setHeigth(int height) {
		this.height = height;
	}
	
	public Triangle(int base, int height) {
				this.base = base;
		this.height = height;
	}
	
	public Triangle() {
		
	}

	@Override
	public int getArea() {
		return base * height / 2;
	}
}
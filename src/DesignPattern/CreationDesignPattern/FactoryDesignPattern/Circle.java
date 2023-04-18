package DesignPattern.CreationDesignPattern.FactoryDesignPattern;

import DesignPattern.CreationDesignPattern.FactoryDesignPattern.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}

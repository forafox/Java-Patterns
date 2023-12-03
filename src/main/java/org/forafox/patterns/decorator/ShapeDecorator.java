package org.forafox.patterns.decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    //Конструктор, принимающий объект Shape
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
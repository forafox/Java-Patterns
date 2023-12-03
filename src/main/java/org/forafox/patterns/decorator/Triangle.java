package org.forafox.patterns.decorator;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("I'm triangle!");
    }
}

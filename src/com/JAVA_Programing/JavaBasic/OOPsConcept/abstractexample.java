package com.JAVA_Programing.JavaBasic.OOPsConcept;
public class abstractexample {
    abstract class Shapes {
        abstract void area();

        void display() {
            System.out.println("shape is created");
        }
    }

    class circle extends Shapes {
        int radius;

        circle(int radius) {
            this.radius = radius;
        }

        @Override
        void area() {
            System.out.println(3.14 * radius * radius);
        }
    }
    public class Rectangle extends Shapes {
        int width;
        int height;
        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        @Override
        void area() {
            System.out.println(width * height);
        }
    }
    public  void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,4);
        circle circle=new circle(5);
        circle.display();
        rectangle.area();
    }
}

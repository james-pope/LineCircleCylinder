package com.company;

public class Circle {

    private double radius;

        public Circle(double r){
            radius = r;
        }
        public double area(){
            double a = radius*radius;
            return Math.PI * a;
        }
        public double circumference(){
            double a = 2 * (Math.PI * radius);
            return a;
        }

    public static void main(String [] args){
            Circle cir1 = new Circle(2);
            Circle cir2 = new Circle(5);

            double area1 = cir1.area();
            System.out.print(area1);
            double circumference1 = cir2.circumference();
            System.out.println();
            System.out.print(circumference1);
        }
}

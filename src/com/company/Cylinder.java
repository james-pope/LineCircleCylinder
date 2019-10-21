package com.company;

public class Cylinder {

    private Circle base;
    private double height;

        public Cylinder(int r, int h){
            base = new Circle(r);
            height = h;
        }
        public double vol(){
            double a = base.area() * height;
            return a;
        }
        public double sa(){
            double a = (2 *(base.area()) + (base.circumference()*height));
            return a;
        }
    }

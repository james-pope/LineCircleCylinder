package com.company;

public class Cylinder {

    private Circle base;
    private double height;
    private double radius;

        public Cylinder(int r, int h){
            base = new Circle(r);
            height = h;
            radius = r;
        }
        public double vol(){
            double a = Math.PI * (radius * radius) * height;
            return a;
        }
        public double sa(){
            double a = (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius));
            return a;
        }
    }

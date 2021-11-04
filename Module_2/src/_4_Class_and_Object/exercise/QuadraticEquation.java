package _4_Class_and_Object.exercise;

import _4_Class_and_Object.practice.Rectangle;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){}
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta = b*b - 4*a*c;
        return delta;
    }
    public double getRoot1(){
        if (this.getDiscriminant()<0){
            return 0;
        }else {
            double r1 = (-b + Math.pow(this.getDiscriminant(),0.5))/2/a;
            return r1;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant()<0){
            return 0;
        }else {
            double r2 = (-b - Math.pow(this.getDiscriminant(),0.5))/2/a;
            return r2;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = kb.nextDouble();
        System.out.println("Enter b : ");
        double b = kb.nextDouble();
        System.out.println("Enter c : ");
        double c = kb.nextDouble();
        QuadraticEquation m = new QuadraticEquation(a,b,c);
        if (m.getDiscriminant()>0){
            System.out.println("The equation has 2 roots :"+"root1 : "+m.getRoot1()+"\t"+"root2 : "+m.getRoot2());
        }else if (m.getDiscriminant() == 0){
            System.out.println("The equation has 1 roots :"+"root1 : "+m.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}

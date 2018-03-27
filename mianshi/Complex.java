package com.zj.javatest;

public class Complex {

    private double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static Complex add(Complex c1, Complex c2) {

        Complex c3 = new Complex(0, 0);
        c3.a = c1.a + c2.a;
        c3.b = c1.b + c2.b;
        return c3;

    }

    public static Complex sub(Complex c1, Complex c2) {

        Complex c3 = new Complex(0, 0);
        c3.a = c1.a - c2.a;
        c3.b = c1.b - c2.b;
        return c3;

    }

    public static Complex multi(Complex c1, Complex c2) {

        Complex c3 = new Complex(0, 0);
        c3.a = c1.a * c2.a - c1.b * c2.b;
        c3.b = c1.a * c2.b + c2.a * c1.b;

        return c3;

    }

    public static Complex divide(Complex c1, Complex c2) {

        Complex c3 = new Complex(0, 0);
        c3.a = (c1.a * c2.a - c1.b * c2.b) / (c2.a * c2.a + c2.b * c2.b);
        c3.b = (c2.a * c1.b + c1.a * c2.b) / (c2.a * c2.a + c2.b * c2.b);

        return c3;

    }

    @Override
    public String toString() {
        return a+"+"+b+"i";
    }

    public static void main(String[] args) {

        Complex complex = new Complex(0, 0);
        System.out.println(complex);

    }

}


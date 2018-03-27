package com.zj.javatest;

public class Complex2 {

    //实部
    private double a;
    //虚部
    private double b;

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

    public Complex2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //公式：(a+bi)+(c+di)=a+b+(b+d)i
    public Complex2 add( Complex2 c2) {
        Complex2 c3 = new Complex2(0, 0);
        c3.a = this.a + c2.a;
        c3.b = this.b + c2.b;
        return c3;
    }

    //公式：(a+bi)-(c+di)=(a-c)+(c-d)i
    public Complex2 sub(Complex2 c2){
        return new Complex2(this.a-c2.getA(),this.b-c2.getB());
    }

    //公式：(a+bi)*(c+di)=(ac-bd)+(ad+bc)i
    public Complex2 multi(Complex2 c2){
        Complex2 c3 = new Complex2(0, 0);
        c3.setA(this.a*c2.getA()-this.b*c2.getB());
        c3.setB(this.a*c2.getB()+this.b*c2.getA());
        return c3;
    }

    //公式：(a+bi)/(c+di) = (ac+bd)/(c*c+d*d)+(bc-ad)/(c*c+d*d)*i
    public Complex2 divide(Complex2 c2){
        Complex2 c3 = new Complex2(0, 0);
        double c = c2.getA();
        double d = c2.getB();
        c3.setA((a*c+b*d)/(c*c+d*d));
        c3.setB((b*c-a*d)/(c*c+d*d));
        return c3;
    }

    @Override
    public String toString() {
        return this.a+"+"+this.b+"i";
    }

    public static void main(String[] args) {
        Complex2 c1 = new Complex2(1, 1);
        Complex2 c2 = new Complex2(2, 2);
        Complex2 c3 = c1.add(c2);
        System.out.println(c3);

    }


}

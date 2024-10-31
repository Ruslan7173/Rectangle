package org.example;

public class Rectangl1 {
    int a;
    int b;

    public Rectangl1(double a, double b) throws Exception {
        if(a<=0 || b<=0)
            throw new Exception("Отрицательный размер отрезка");

        this.a = (int) a;
        this.b = (int) b;
    }
    public  double square (double a,double b){
        double s=a*b;
        return s;

    }
    public  double perimetr (double a,double b) {
        double p = (a + b) * 2;
        return p;
    }



}

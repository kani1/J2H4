package com.company;

public class Garage <A extends Car> implements Printable <A> {
    private A garage;
    public Garage(){}

    public Garage(A garage) {
        this.garage = garage;
    }

    public A getGarage() {
        return garage;
    }

    public void setGarage(A garage) {
        this.garage = garage;
    }

    @Override
    public void print(A a) {
        System.out.println(a.getClass().getSimpleName());

    }

}

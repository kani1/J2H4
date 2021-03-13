package com.company;

public class Garage <A extends Car> implements Printable <A> {
    private A garage;


    @Override
    public void print(A a) {
        System.out.println(a.getClass().getSimpleName());

    }

}

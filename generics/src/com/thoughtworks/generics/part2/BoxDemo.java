package com.thoughtworks.generics.part2;

public class BoxDemo {
    public static void main(String[] args) {

        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject=someInteger;            /*is a relationship */

        Box<Number> box = new Box<Number>();

        box.setHeight(new Integer(10));
        System.out.println("Integer=>"+box.getHeight());

        box.setHeight(new Double(10.2));
        System.out.println("Double=>"+box.getHeight());


    }
}
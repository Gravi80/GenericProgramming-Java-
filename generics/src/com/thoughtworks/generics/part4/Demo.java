package com.thoughtworks.generics.part4;

public class Demo {
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4};
        String[] stringArray = {"one","two","three"};
        GenericMethod.printMe(intArray);
        GenericMethod.printMe(stringArray);

        GenericMethod<Number> integerGenericMethod = new GenericMethod<Number>();
        integerGenericMethod.Triple(2, 7.8f, 2.9);
        System.out.println(integerGenericMethod.getFirst());
        System.out.println(integerGenericMethod.getSecond());
        System.out.println(integerGenericMethod.getThird());
    }
}
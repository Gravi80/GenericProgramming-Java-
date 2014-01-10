package com.thoughtworks.generics.part4;

public class GenericMethod<T> {

    private T first, second, third;

    public static  <T> void printMe(T []array) {
        for (T value : array) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }

    public <U extends T, V extends T, W extends T> void Triple(U arg1, V arg2, W arg3) {
            first = arg1;
            second = arg2;
            third = arg3;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}
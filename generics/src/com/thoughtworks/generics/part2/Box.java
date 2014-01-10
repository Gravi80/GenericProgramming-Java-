package com.thoughtworks.generics.part2;

/**
 * Created with IntelliJ IDEA.
 * User: ravi
 * Date: 2/4/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Box <T> {
    private T height;

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
}
package com.thoughtworks.generics.part1.whyGeneric;

import java.util.ArrayList;
import java.util.List;

public class WithObject {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        Integer number = (Integer)list.get(0);
        System.out.println(number);
    }
}
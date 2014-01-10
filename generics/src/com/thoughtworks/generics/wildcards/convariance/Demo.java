package com.thoughtworks.generics.wildcards.convariance;

import com.thoughtworks.generics.wildcards.common.Apple;
import com.thoughtworks.generics.wildcards.common.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<Fruits>();
        List<? super Apple> otherFruits = fruits;

    }

}
package com.thoughtworks.generics.wildcards.contravariance;

import com.thoughtworks.generics.wildcards.common.Apple;
import com.thoughtworks.generics.wildcards.common.Banana;
import com.thoughtworks.generics.wildcards.common.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<Apple>();
        List<? extends Fruits> fruits = apples;

//        java compiler prevents us to add a banana to a list of fruits
//       fruits.add(new Banana());

    }

}
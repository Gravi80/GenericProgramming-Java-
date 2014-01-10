package com.thoughtworks.generics.part1;

import java.util.HashMap;
import java.util.Map;

public class SuperCoolPair<A,B> {
    private A first;
    private B second;

    public SuperCoolPair( A first, B second) {
        Map<A,B> map = new HashMap<A, B>();
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

}
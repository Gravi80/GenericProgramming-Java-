package com.thoughtworks.generics.part3;

/**
 * Created with IntelliJ IDEA.
 * User: ravi
 * Date: 3/4/13
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pair<K,V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
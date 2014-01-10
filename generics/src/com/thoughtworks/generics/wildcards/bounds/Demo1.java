package com.thoughtworks.generics.wildcards.bounds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo1 {

    Collection<?> coll = new ArrayList<String>();

    List<? extends Number> list = new ArrayList<Long>();

    List<? super ArrayList> list3 = new ArrayList<Object>();
}
package com.thoughtworks.generics.part3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ravi
 * Date: 3/4/13
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Erasure {
    public static void main(String[] args) {
//        System.out.println("runtime type of ArrayList<String>: "+new ArrayList<String>().getClass());
//        System.out.println("runtime type of ArrayList<Long> : "+new ArrayList<Long>().getClass());

        m1();
    }

        static void m1() {
            List<Date> list = new ArrayList<Date>();
            list.add(new Date());
            m2(list);
        }

        static void m2(Object arg) {
            List<String> list = (List<String>) arg; // unchecked warning
            m3(list);
        }

        static void m3(List<String> list) {
            String s = list.get(0); // ClassCastException
        }

}

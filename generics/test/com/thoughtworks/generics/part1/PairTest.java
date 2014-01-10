package com.thoughtworks.generics.part1;

import com.thoughtworks.generics.part1.Pair;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class PairTest {

    @Test
    public void shouldGiveFirstValueOfAnIntegerPair(){
        Pair pair = new Pair(2,3);
        int value= pair.getFirst();
        assertThat(value, IsEqual.equalTo(2));
    }

    @Test
    public void shouldGiveSecondValueOfAnIntegerPair(){
        Pair pair = new Pair(2,3);
        int value= pair.getSecond();
        assertThat(value, IsEqual.equalTo(3));
    }
//
//    @Test
//    public void shouldGiveFirstValueOfAFloatPair(){
//        Pair pair = new Pair(2.3f,3.5f);
//    }

//    @Test
//    public void shouldGiveFirstValueOfAStringPair(){
//        Pair pair = new Pair("a","b");
//    }
}
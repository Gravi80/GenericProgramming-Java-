package com.thoughtworks.generics.part1;

import com.thoughtworks.generics.part1.SuperCoolPair;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class SuperCoolPairTest {

    @Test
    public void shouldGiveFirstValueOfAnIntegerPair(){
        SuperCoolPair<Integer, Integer> superCoolPair = new SuperCoolPair<Integer,Integer>(2,3);
        int value=superCoolPair.getFirst();
        assertThat(value, IsEqual.equalTo(2));
    }

    @Test
    public void shouldGiveSecondValueOfAnIntegerPair(){
        SuperCoolPair<Integer, Integer> superCoolPair = new SuperCoolPair<Integer,Integer>(2,3);
        int value= superCoolPair.getSecond();
        assertThat(value, IsEqual.equalTo(3));
    }

    @Test
    public void shouldGiveFirstValueOfAFloatPair(){
        SuperCoolPair<Float,Float> superCoolPair = new SuperCoolPair<Float,Float>(2.3f,3.5f);
        float value=superCoolPair.getFirst();
        assertThat(value, IsEqual.equalTo(2.3f));
    }

    @Test
    public void shouldGiveSecondValueOfAFloatPair(){
        SuperCoolPair<Float,Float> superCoolPair = new SuperCoolPair<Float,Float>(2.3f,3.5f);
        float value=superCoolPair.getSecond();
        assertThat(value, IsEqual.equalTo(3.5f));
    }

    @Test
    public void shouldGiveFirstValueOfAStringPair(){
        SuperCoolPair<String,String> superCoolPair = new SuperCoolPair<String,String>("string1","string2");
        String value=superCoolPair.getFirst();
        assertThat(value, IsEqual.equalTo("string1"));
    }

    @Test
    public void shouldGiveSecondValueOfAStringPair(){
        SuperCoolPair<String,String> superCoolPair = new SuperCoolPair<String,String>("string1","string2");
        String value=superCoolPair.getSecond();
        assertThat(value, IsEqual.equalTo("string2"));
    }

    @Test
    public void shouldGiveFirstValueOfAStingAndIntegerPair(){
        SuperCoolPair<String,Integer> superCoolPair = new SuperCoolPair<String,Integer>("jamesBond",007);
        String value=superCoolPair.getFirst();
        assertThat(value, IsEqual.equalTo("jamesBond"));
    }


}
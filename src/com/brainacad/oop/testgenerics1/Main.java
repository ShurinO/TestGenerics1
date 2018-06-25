package com.brainacad.oop.testgenerics1;

public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("FirstMyTuple",1,10000000000L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(2.0,"SecondMyTuple","20000000000L");
    }
}

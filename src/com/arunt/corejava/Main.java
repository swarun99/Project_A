package com.arunt.corejava;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello my time");

        Thread t = new Thread( new TestThread(), "t1");
        Thread t2 = new Thread( new TestThread(), "t2");
        Thread t21 = new Thread( new TestThread(), "t3");
        Thread t3 = new Thread( new TestThread(), "t4");
        Thread t4 = new Thread( new TestThread(), "t5");
        Thread t5 = new Thread(new TestThread(), "t51");

        t.start();
        t2.start();
        t21.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

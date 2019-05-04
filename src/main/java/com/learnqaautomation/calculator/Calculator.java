package com.learnqaautomation.calculator;

public class Calculator {

    public int add(int x, int y){

        int results = x+y;
        System.out.println("Add Results: " + results);
        return results;
    }

    public int deduct(int x, int y){

        int results = x - y;
        System.out.println("Deduct Results: " + results);

        return results;
    }


}

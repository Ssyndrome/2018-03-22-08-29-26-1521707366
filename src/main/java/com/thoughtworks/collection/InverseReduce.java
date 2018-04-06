package com.thoughtworks.collection;

import java.util.ArrayList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> result = new ArrayList<>();
        int num = number-2;
        do{
            result.add(num);
            num = num-2;
        }while(num>=0);
        return result;
    }
}

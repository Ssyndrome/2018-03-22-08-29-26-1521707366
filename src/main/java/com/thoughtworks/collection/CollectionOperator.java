package com.thoughtworks.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {

    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left>right){
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }else{
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if(left>right){
            for (int i = left; i >= right; i--) {
                if(i%2 == 0) result.add(i);
            }
        }else{
            for (int i = left; i <= right; i++) {
                if(i%2 == 0) result.add(i);
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0) result.add(array[i]);
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for(int numF : firstArray){
            for(int numS : secondArray){
                if(numF == numS) result.add(numF);
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = Arrays.asList(firstArray);
        List<Integer> secondList = Arrays.asList(secondArray);
        List<Integer> result = new ArrayList<>();
        result.addAll(firstList);
        for(Integer num : secondList){
            if(!firstList.contains(num)) result.add(num);
        }
        return result;
    }
}

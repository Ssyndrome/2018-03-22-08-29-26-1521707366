package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder > rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max = leftBorder > rightBorder ? leftBorder : rightBorder;
        int min = leftBorder > rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int element : arrayList) {
            sum += element * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int element : arrayList) {
            if (element % 2 != 0) {
                result.add(element * 3 + 2);
            } else {
                result.add(element);
            }
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int element : arrayList) {
            if (element % 2 != 0) {
                result.add(element * 3 + 5);
            }
        }
        int sum = 0;
        for (int odd : result) {
            sum += odd;
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArr = new ArrayList<>();
        double median;
        for (int num:arrayList){
            if(num%2 == 0) evenArr.add(num);
        }
        int len = evenArr.size();
        if (len%2 == 0){
            median = ((evenArr.get(len/2-1)+evenArr.get(len/2))/2);
        }else{
            median = evenArr.get(len/2);
        }
        return median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int evenNum = 0;
        int evenSum = 0;
        for (int num:arrayList){
            if(num%2 == 0) {
            evenSum +=num;
            evenNum++;
            }
        }
        return (double)(evenSum/evenNum);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenArr = new ArrayList<>();
        for (int num:arrayList){
            if(num%2 == 0) evenArr.add(num);
        }
        return evenArr.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArr = new ArrayList<>();
        for (int num:arrayList){
            if(num%2 == 0) evenArr.add(num);
        }
        List<Integer> noRepArr = new ArrayList<>();
        noRepArr.add(evenArr.get(0));
        for (int i = 1; i < evenArr.size(); i++) {
            if(!noRepArr.contains(evenArr.get(i))) noRepArr.add(evenArr.get(i));
        }
        return noRepArr;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> eArr = new ArrayList<>();
        List<Integer> oArr = new ArrayList<>();
        for(int ele : arrayList){
            if(ele%2 == 0){
                eArr.add(ele);
            }else {
                oArr.add(ele);
            }
        }
        Collections.sort(eArr);
        Collections.reverse(oArr);
        eArr.addAll(oArr);
        return eArr;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (arrayList.size() - 1); i++) {
            result.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return result;
    }

}

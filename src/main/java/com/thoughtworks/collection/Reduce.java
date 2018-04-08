package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        return arrayList.get(0);
    }

    public double getMinimum() {
        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public double getAverage() {
        int sum = 0;
        for (Integer num:arrayList){
            sum += num;
        }
        return (double)(sum*1.0/arrayList.size());
    }

    public double getOrderedMedian() {
        int len = arrayList.size();
        return len%2 == 0? (arrayList.get(len/2-1)*1.0+arrayList.get(len/2)*1.0)/2:arrayList.get(len/2);
    }

    public int getFirstEven() {
        List<Integer> list = new ArrayList<>();
        for(Integer num : arrayList){
            if(num%2 == 0) list.add(num);
        }
        return list.get(0);
    }

    public int getIndexOfFirstEven() {
        int res = 0;
        int index = 0;
        do{
            if(arrayList.get(index)%2 == 0) {
                res = 1;
                index++;
            }
        }while(res == 0);
        return index;
    }

    public boolean isEqual(List<Integer> arrayList_1) {
        boolean result = true;
        if(arrayList_1.size() != arrayList.size()) {
            result = false;
        }
        for (int i = 0; i < arrayList_1.size(); i++) {
            if(!arrayList_1.get(i).equals(arrayList_1.get(i))){
                result = false;
            }
        }
        return result;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        List<Integer> result = new ArrayList<>();
        for (Integer num: arrayList){
            if(num%2 != 0){
                result.add(num);
            }
        }
        return result.get(result.size()-1);
    }

    public int getIndexOfLastOdd() {
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < arrayList.size();i++){
            if(arrayList.get(i)%2 != 0){
                result.add(i);
            }
        }
        return result.get(result.size()-1);
    }
}

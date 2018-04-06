package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for(Integer num:array){
            result.add(num*3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for(Integer num:array){
            result.add(letterList.get(num-1));
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for(Integer num:array){
            result.add(getLetter(num));
        }
        return result;
    }
    public String getLetter(int num){
        if(num>0 && num <27){
            return letterList.get(num-1);
        }else if(num%26 == 0){
            return letterList.get(num/26-2).concat("z");
        }else{
            return letterList.get(num/26-1).concat(letterList.get(num%26-1));
        }
    }

    public List<Integer> sortFromBig() {
        Collections.reverse(array);
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}

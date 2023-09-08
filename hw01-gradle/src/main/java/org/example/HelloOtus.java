package org.example;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        Integer[] arrList = {1, 2, 3, 4};

        List<Integer> list = Arrays.asList(arrList);
        List<Integer> reverse = Lists.reverse(list);
        System.out.println(list);
        System.out.println(reverse);
    }
}

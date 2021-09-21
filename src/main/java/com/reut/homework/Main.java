package com.reut.homework;

import com.reut.homework.stream.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("was");
        System.out.println(Task2.createBadWordsDetectingStream("I was a superman", list));
    }
}

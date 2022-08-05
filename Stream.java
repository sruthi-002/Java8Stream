package com.company;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int n ,i;
        n = in.nextInt();
        for(i=0;i<n;i++)
            list.add(in.next());
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}

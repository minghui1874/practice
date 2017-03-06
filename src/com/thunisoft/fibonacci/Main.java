package com.thunisoft.fibonacci;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * @author minghui
 * @create 2017-03-03 18:02
 */
public class Main {
    public static void main(String[] args){
        ForkJoinPool pool = new ForkJoinPool();
        Scanner scan = new Scanner(System.in);
        int end = Integer.valueOf(scan.next());
        FibonacciTask fibo = new FibonacciTask(0, end);

        
    }
}

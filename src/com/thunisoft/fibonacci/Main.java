package com.thunisoft.fibonacci;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author minghui
 * @create 2017-03-03 18:02
 */
public class Main {
    public static void main(String[] args){
       while(true){
           System.out.println("请输入想要计算的数列位数:");
           ForkJoinPool pool = new ForkJoinPool();
           Scanner scan = new Scanner(System.in);
           int index = Integer.valueOf(scan.next());
           FibonacciTask fibo = new FibonacciTask(index);
           //使用ForkJoinTask来执行任务并获取结果
           ForkJoinTask<Integer> result = pool.submit(fibo);
           try{
               System.out.println("当前位数结果为:"+result.get());
           }catch(InterruptedException  | ExecutionException e){
               e.printStackTrace();
           }
       }

        
    }
}

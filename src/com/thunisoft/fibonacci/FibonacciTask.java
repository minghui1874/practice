package com.thunisoft.fibonacci;

import java.util.concurrent.RecursiveTask;

/**
 * @author minghui
 * @create 2017-03-03 17:44
 */
public class FibonacciTask extends RecursiveTask<Integer>{
    private static final int THRESHOLD = 2;//阀值
    private int index;

    public FibonacciTask(int index) {
        this.index = index;
    }

    @Override
    protected Integer compute() {
        int fibo = 0;
        if(index == 1 || index ==2){
            fibo = 1;
            return fibo;
        }
        //如果任务太小就直接展示出来
        if((index) <= THRESHOLD){
            fibo = index;
        }else{
            FibonacciTask t1 = new FibonacciTask(index-1);
            FibonacciTask t2 = new FibonacciTask(index-2);
            //执行子任务
            t1.fork();
            t2.fork();
            //等待子任务执行完成，并得到其结果
            int t1Result = t1.join();
            int t2Result = t2.join();
            fibo = t1Result + t2Result;
        }
        return fibo;
    }
}

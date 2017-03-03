package com.thunisoft.fibonacci;

import java.util.concurrent.RecursiveTask;

/**
 * @author minghui
 * @create 2017-03-03 17:44
 */
public class FibonacciTask extends RecursiveTask<Integer>{
    private static final int THRESHOLD = 3;//阀值
    private int start;
    private int end;

    public FibonacciTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int fibo = 0;
        if(end == 1 || end ==2){
            fibo = 1;
            return fibo;
        }
        //如果任务太小就直接展示出来
        if(end-start < THRESHOLD){
            fibo = (end -1)+(end -2);
        }else{
            //如果任务大于阀值，就分裂为两个子任务来计算
        }
        return null;
    }
}

package com.thunisoft.cap;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by minghui on 2017/3/8.
 */
public class CAP {


    //仓库
    private static List<String> storageList = new LinkedList<>();

    //仓库容量
    private static final int MAX_SIZE = 10;

    private static final int ZERO = 0;

    //生产者
    private static class Producer implements Runnable {

        private void produce() {
            synchronized (storageList) {
                try {
                    while (storageList.size() >= MAX_SIZE) {
                        System.out.println("仓库已满，停止生产");
                        storageList.wait();//仓库满了就放弃锁，让其他线程来执行
                    }
                    String name = "产品" + new Random().nextInt();
                    storageList.add(name);
                    System.out.println(Thread.currentThread().getName() + "生产了一个产品");
                    Thread.sleep(100);
                    storageList.notifyAll();//唤醒其他线程

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        @Override
        public void run() {
            while (true) {
                produce();
            }
        }
    }

    //消费者
    private static class Customer implements Runnable {
        private void consume() {
            synchronized (storageList) {
                try {
                    while (storageList.size() <= ZERO) {
                        System.out.println("仓库为空，等待生产者生产");
                        storageList.wait();
                    }
                    System.out.println(Thread.currentThread().getName() + "取得产品：" + storageList.remove(0));
                    Thread.sleep(100);
                    storageList.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        @Override
        public void run() {
            while (true) {
                consume();
            }
        }
    }


    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Producer()).start();
        new Thread(new Customer()).start();
    }
}

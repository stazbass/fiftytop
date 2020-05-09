package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Step06 implements Solution {
    @Override
    public String toString() {
        return "Avoiding deadlock in Java";
    }

    static Long value = 0L;

    public static class Deadlocker{
        public void methodOne(){
            synchronized (String.class){
                System.out.println("String class locked");
                synchronized (Integer.class){
                    System.out.println("Integer class locked");
                }
            }
        }

        public void methodTwo(){
            synchronized (Integer.class){
                System.out.println("Integer class locked");
                synchronized (String.class){
                    System.out.println("String class locked");
                }
            }
        }
    }

    @Override
    public void run() {
        Runnable r1 = ()->{
            long runPeriod = 100000;
            long startTime = System.currentTimeMillis();
            Deadlocker deadlocker = new Deadlocker();
            while(System.currentTimeMillis() - startTime < runPeriod){
                deadlocker.methodOne();
                System.out.println("Running first thread");
            }
        };
        Runnable r2 = ()->{
            long runPeriod = 100000;
            long startTime = System.currentTimeMillis();
            Deadlocker deadlocker = new Deadlocker();
            while(System.currentTimeMillis() - startTime < runPeriod){
                deadlocker.methodTwo();
                System.out.println("Running second thread");
            }
        };
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

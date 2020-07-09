package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeCounter implements Runnable{
    static int counter = 1;

    static ReentrantLock counterLock = new ReentrantLock(true);

    static void incrementCounter(){
        counterLock.lock();

  
        try{
            System.out.println("Door"+Thread.currentThread().getName() + ": " + counter);
            counter++;
        }finally{
             counterLock.unlock();
        }
     }

    @Override
    public void run() {
        while(counter<500){
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        ThreadSafeCounter te = new ThreadSafeCounter();
        Thread Door1 = new Thread(te);
        Thread Door2 = new Thread(te);

        Door1.start();
        Door2.start();          
    }
}


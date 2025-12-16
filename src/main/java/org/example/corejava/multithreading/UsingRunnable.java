package org.example.corejava.multithreading;

class MyNewThread implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class UsingRunnable {

    public static void main(String[] args) {
        MyNewThread r = new MyNewThread();
        Thread t1 = new Thread(r);
        t1.setName("Thread-1");
        t1.start();

    }
}

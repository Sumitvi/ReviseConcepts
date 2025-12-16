package org.example.corejava.multithreading;


class MyThread extends Thread{

    @Override
    public void run(){

        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() +" "+ i);
        }
    }
}



public class ExtendingThread {

    public static void main(String[] args) {

//        Executing multiple threads simultaneously
//        within a single process is called multithreading.

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();


    }


}

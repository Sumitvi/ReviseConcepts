package org.example.corejava.multithreading;


class MyDemo implements Runnable{

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class MethodsDemo {

    public static void main(String[] args) {
        MyNewThread r = new MyNewThread();
        Thread t1 = new Thread(r);
        t1.setName("Thread-1");
        t1.start();


        Thread t2 = new Thread(new MyNewThread());
        t2.setName("Thread-2");
        t2.start();


//        Thread Priority Method
        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);


    }
}





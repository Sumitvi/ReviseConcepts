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

//        The Output is unpredictable it totally depends on thread scheduling


        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

//        we use start() intead of run() bcz start() creates new threat while
//        run excute like normal function

    }


}

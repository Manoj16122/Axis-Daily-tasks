package Threads;

public class ThreadDemo {


    public static void main(String args[]){
        ThreadUsingRunnable obj = new ThreadUsingRunnable();
        Thread t1 = new Thread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
    
}

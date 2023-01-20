package Threads;

public class ThreadJoin extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
            
           System.out.println(Thread.currentThread().getState());
        }
    }
    
}

package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args){
        ExecutorService obj = Executors.newFixedThreadPool(3);
        for(int i = 0 ; i < 10 ; i++){
            Runnable thread_demo = new ThreadPoolDemo();  
            obj.execute(thread_demo); 
        }
        //Runnable thread_demo2 = new ThreadPoolDemo();
       // obj.execute(thread_demo);
        //obj.shutdown();
    }
    
}

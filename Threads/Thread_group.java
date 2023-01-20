package Threads;

public class Thread_group {

    public static void main(String[] args){
        Threadsimp threadDemo = new Threadsimp();
        ThreadGroup gp1 = new ThreadGroup("Group 1");
        Thread t1 = new Thread(gp1, threadDemo, "1");
        Thread t2 = new Thread(gp1, threadDemo, "2");
        Thread t3 = new Thread(gp1, threadDemo, "3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(gp1.activeCount());
        gp1.destroy();

    }
    
}

package MultipleThreads;

public class Threaddemo2 extends Thread {

    public void run(){
        for(int i=100; i<200; i++){
            System.out.println(i);
            try{
                Thread.sleep(1250);

            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
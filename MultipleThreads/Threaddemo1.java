package MultipleThreads;

public class Threaddemo1 extends Thread {

    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);

            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}

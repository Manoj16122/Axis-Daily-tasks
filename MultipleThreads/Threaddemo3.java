package MultipleThreads;

public class Threaddemo3 extends Thread {
    public void run(){
        for(int i=200; i<300; i++){
            System.out.println(i);
            try{
                Thread.sleep(750);

            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    

    
public static void  main(String args[]){
    Threaddemo1 d1 = new Threaddemo1();
    Threaddemo2 d2 = new Threaddemo2();
    Threaddemo3 d3 = new Threaddemo3();
    d1.start();
    d2.start();
    d3.start();
    d1.setPriority(3);
    d2.setPriority(5);
    d3.setPriority(10);
}
}

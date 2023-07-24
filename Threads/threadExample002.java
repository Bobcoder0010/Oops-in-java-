class myThread extends Thread{
    public void run(){
        for(int i = 1; i<= 10; i++){
            System.out.println("user thead value + i");
        }
    }
}

public class threadExample002{
    public static void main(String[] args){
        myThread mt = new myThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
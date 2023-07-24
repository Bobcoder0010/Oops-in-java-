class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("user thead value + i");
        }
    }
}

public class RunnableImplementation {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
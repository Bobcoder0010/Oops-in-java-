class threadExample extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        threadExample t1 = new threadExample();
        threadExample t2 = new threadExample();
        threadExample t3 = new threadExample();

        System.out.println("t1 thread proirity : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority());
        System.out.println("t3 thread priority : " + t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority());
        System.out.println("t3 thread priority : " + t3.getPriority());

        System.out.println("Currently executing thread : " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority" + Thread.currentThread().getPriority());
    }

}

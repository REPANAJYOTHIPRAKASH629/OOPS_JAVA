class EgRunnableThread implements Runnable{
    public void run()
    {
        System.out.println("Thread is running..");
    } 
    public static void main(String args[])
    {
        EgRunnableThread t1 = new EgRunnableThread();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}

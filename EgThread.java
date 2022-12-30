class EgThread extends Thread {
public void run()
{
    System.out.println("thread is running...");
}
public static void main(String args[])
{
    EgThread t1 = new EgThread();
    t1.start();
}
}

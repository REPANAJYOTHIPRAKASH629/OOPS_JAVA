public class CountAndPrint implements Runnable{
    private final String name;
    CountAndPrint(String name)
    {
        this.name = name;
    }    
    @Override
    public void run()
    {
        for(int i=0;i<=10000;i++)
        {
            System.out.println(this.name + " : "+ i);
        }
    }
    public static void main(String args[])
    {
        for(int i =1;i<=4;i++)
        {
            new Thread(new CountAndPrint("Instance "+ i)).start();
        }
        for(int i =0;i<1000;i++)
        {
            System.out.println("Main : " + i);
        }
    }
}

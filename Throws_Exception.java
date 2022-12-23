import java.io.IOException;

public class Throws_Exception {
    void m() throws IOException
    {
        throw new IOException("device error");
    }
    void n() throws IOException
    {
        m();
    } 
    void p()
    {
        try{
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled");
        }
    }
    public static void main(String args[])
    {
        Throws_Exception obj = new Throws_Exception();
        obj.p();
        System.out.println("normal flow");
    }
}

class Test implements Runnable
{
    public void run()
    {
        int num=100;
        while(num<1000)
        {
            if(num%11==0)
            {
                System.out.println(num);
            }
            num++;
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class Paper
{
  public static void main(String arr[])
        {
            Test t = new Test();
            Thread th = new Thread(t);
            th.start();
        }
}
class A  implements Runnable
{
public void run()
{
	try
	{
		for(int i=100;i<1000;i++)
        {
			if(i%11==0)
			{
		System.out.println(i);
	     Thread.sleep(1000); 
				
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}	
}
class Demo1
{
	public static void main(String ar[])
	{
		A a=new A();
		Thread t1=new Thread(a);
        t1.start();
		
	}
}
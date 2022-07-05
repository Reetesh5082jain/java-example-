public class runnableex implements Runnable
{
	public void run()
	{
		System.out.println("thread task 1");
	}
	public static void main(String []args)
	{
		runnableex t = new runnableex();
		Thread a = new Thread(t);
		a.start();
	}
}


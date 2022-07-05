public class threadex extends Thread
{
	public void run()
	{
		System.out.println("thread task");
	}
	public static void main(String[] args)
	{
		threadex t = new threadex();
		t.start();
	}
}
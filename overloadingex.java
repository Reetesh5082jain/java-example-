
class Bird
{
	public void sing (int a) {
		System.out.println("1");
	}
	public void sing (int a, int b) {
		System.out.println("1 2");
	}
	public void sing (String a) {
		System.out.println("1 2 3");
	}
}
public class overloadingex {
    public static void main(String[] args) {
		Bird b = new Bird();
		b.sing(10,10);

	}

}
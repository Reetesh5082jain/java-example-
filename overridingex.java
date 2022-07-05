public class overridingex {
    public static void main(String[] args) {
		Bird b = new Bird();
		Piegion p=new Piegion();
		p.sing();
		b.sing();

	}
}
class Bird
{
	public void sing () {
		System.out.println("1");
	}
}

class Piegion extends Bird{
	public void sing () {
		System.out.println("1 2");
	}
}

class Cock extends Piegion {
	public void sing () {
		System.out.println("1 2 3");
		
	}
}

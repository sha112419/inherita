package inheritance1;

class sha{
	public void one() {
		System.out.println("yes");
	}
}
class rah extends sha{
	public void two() {
		System.out.println("he is");
	}
}
class far extends rah{
	public void three() {
		System.out.println("passed");
	}
}

public class Inher {

	public static void main(String[] args) {
		far s=new far();
		s.one();
		s.two();
		s.three();

	}

}

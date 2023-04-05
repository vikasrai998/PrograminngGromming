
public class ManyClassinOneclass {

	void Display() {
		System.out.println("hello dears ");
		System.out.println("ram ram all of you");
	}
	public static void main(String[] args) {

	}

}

class FirstClass1 extends ManyClassinOneclass{
	public static void main(String[] args) {
		FirstClass1 f1=new FirstClass1();
		f1.Display();
	}
}


class SecondClass2 extends ManyClassinOneclass{
	void Display() {
		System.out.println("radha radha");
	}
	public static void main(String[] args) {
		SecondClass2 s2= new SecondClass2 ();
		s2.Display();
	}
}

class ThirdClass3 extends ManyClassinOneclass{
	void Display() {
		System.out.println("jai shri krishna");
	}
	void Displayram() {
		System.out.println("jai siya ram");
	}
	public static void main(String[] args) {
		ThirdClass3 t3=new ThirdClass3();
		t3.Display();
		t3.Displayram();
		
	}
}




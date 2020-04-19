package ABCEngine;

public class PrintString extends JavaClass {

	@Override
	public void print(String i) {
		if (i == "start") {
			System.out.println("Im learning Java with extended overrided i-String");
		}
	}

	public void printOut(int k) {
		if (k == 0) {
			System.out.println("Im learning Java with overloaded k-int");
			
		}
	}

	public void printOut(char k) {
		if (k == 0) {
			System.out.println("Im learning Java with overloaded k-char");
		}
	}
}
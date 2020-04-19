package Main;

import ABCEngine.*;

public class Main {

	public static void main(String[] args) {
		String i = "start";
		int k = 0;
		char c = 0;

		JavaClass.printStatic(i);

		PrintString printString = new PrintString();
		printString.parentPrint(i);
		printString.printOut(k);
		printString.print(i);
		printString.printOut(c);
	}

}
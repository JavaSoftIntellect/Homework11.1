import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text here:");
		String text = in.nextLine();

		Stack<String> words = new Stack<String>();
		String[] split = text.split(" ");
		for (String word : split) {
			words.push(word);
		}
		while (!words.empty()) {
			System.out.printf(words.pop() + " ");
		}
		in.close();
	}

}

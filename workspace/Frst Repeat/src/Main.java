

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;
import java.util.Stack;

	public class Main {

		public static void DuplicateFind(String str) {
			Stack<Character> stk = new Stack<Character>();
			HashMap<Character, Integer> k = new HashMap<>();

			for (int i = str.length()-1; i >= 0; i--) {

				if (k.containsKey(str.charAt(i))) {
					
					stk.push(str.charAt(i));
				} else {
					k.put(str.charAt(i), 0);
				}

			}

			System.out.println(stk.pop());

	

		}

		public static void main(String[] args) {
			
			String word;
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the String value:");
			word = scan.next();
			DuplicateFind(word);

	
		}
	}



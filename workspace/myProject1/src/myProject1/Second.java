package myProject1;

import java.util.Scanner;

public class Second {
	public void sum(){
		int m = 0, n;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		n = key.nextInt();
		for(int i = 1; i <= n; i++)
			m = m + i;
		System.out.println("The sum of 1 + 2 + .... + " + n + " is: " + m);
	}
}


import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args)
	{
		Stack stk = new Stack();
		PerformArithmeticOperations opr = new PerformArithmeticOperations();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter postfix expression.");
		String input = scn.nextLine();
	
		
		
		for(int j = 0;j<input.length();j++)
		{
			//System.out.println("Stack Size: "+input.length());
			//System.out.println(stk.elementAt(j).toString());
			boolean isInteger = Character.toString(input.charAt(j)).matches("[0-9]");
			//System.out.println(isInteger);
			if(isInteger == true)
			{
				stk.push(Integer.parseInt(Character.toString(input.charAt(j))));	
				System.out.println(stk);
			}
			else{
				try
				{
				
					
					opr.Operation(stk,input.charAt(j));
					System.out.println(stk);
				
				}
				catch(Exception ex)
				{
System.out.println(ex);
				}
			}
		}
		System.out.println("Final Output: "+stk);
			
		

	    
	}
}

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
	 System.out.println("Please enter a word:");
	 Scanner scn = new Scanner(System.in);
	 String input = scn.nextLine();
	 	 
	 Hashtable<Integer, String> findDuplicates = new Hashtable<Integer, String>();
	 for(int i = 0;i<input.length();i++)
	 {
		
    //	
	
    	findDuplicates.put((int)input.charAt(i), Character.toString(input.charAt(i)));
	 
	 }
	 
	 for(int j = 0;j<input.length();j++)
	 {
		 String output =  findDuplicates.get((int)input.charAt(j));
		 if(output != null)
		 {
			 System.out.println(output);
			 break;
		 }
		 
	 }
}
}

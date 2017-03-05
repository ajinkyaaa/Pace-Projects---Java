import java.util.List;
import java.util.Scanner;
import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {

	static ArrayList<String> Fruits = new ArrayList<String>();
	public static void main(String[] args)
	{
		
		Items<String> food = new Items<String>(Fruits);
		String FruitName = "";

	    Scanner scn = new Scanner(System.in);
	
	    System.out.println("Please select one option.\n");;
		
		System.out.println("1 -Please enter fruit name to insert.");;
		System.out.println("2 -Please enter fruit name to remove.");;
		System.out.println("3 -Check to see if list empty?");;
		System.out.println("4 -Check to see if item present?");;
		System.out.println("5 -Select this option to empty the list.");
		System.out.println("6 -Get items in List.");
		int UserInput = 0;
	    try {
	    	UserInput = scn.nextInt();
	    	scn.nextLine();
    }
    catch (InputMismatchException e) {
            System.out.println("Oops!! Please enter only numbers");
            
            System.out.println("Press any key to continue... \n");
            scn.nextLine();
            main(args);
    }

	
//		System.out.println(scn.nextInt());
		if(UserInput == 1)
		{
			
			System.out.println("Please enter fruit name.");
			FruitName = scn.nextLine();
			food.Insert(FruitName);
			
			System.out.println("Item added successfully \n");
			
		}
		else if(UserInput == 2)
		{
			
			System.out.println("Please enter fruit name.");
			String input = scn.nextLine();
			
			if(food.IsPresent(input))
			{
			food.Remove(input);
			System.out.println("Item removed successfully \n");
			}
			else{
				System.out.println("Item does not exist \n");
			}
			
		}
		else if(UserInput == 3)
		{
			
			System.out.println("Is List Empty?");
			System.out.println(food.IsEmpty()+"\n");
			
		}
		else if(UserInput == 4)
		{
			
			System.out.println("Enter fruit name to check if present in the list?");
			
			System.out.println(food.IsPresent(scn.nextLine()));
			
		}
		else if(UserInput == 5)
		{
			
			food.MakeEmpty();
			System.out.println("\n All Items have been removed from the List!");
			
			System.out.println("\n Current Items in List!");
			System.out.println(food.Get()+"\n");
			

		}
		else if(UserInput == 6)
		{
			
			System.out.println("\n Current Items in List!");
			System.out.println(food.Get()+"\n");
			
		}
		else{
			System.out.println("Invalid Choice \n");
			
		}
		System.out.println("Press any key to continue... \n");
	    scn.nextLine();
	    main(args);
	    
	    //
	    
	  
        
	}
}

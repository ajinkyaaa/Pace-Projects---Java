// Main method
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	
	static ArrayList<Rectangle> arr = new ArrayList<Rectangle>();
@SuppressWarnings("unchecked")
public static void main(String[] args)
{
    Scanner scn = new Scanner(System.in);
	
    System.out.println("Please select one option.\n");;
	
	System.out.println("1 - Select this option to add a new Rectangle.");;
	System.out.println("2 - Select this option to show all Rectangles.");;
	System.out.println("3 - Select this option to find the largest Rectangle on basis of Area then Perimeter.");;
	
	
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
	
    if(UserInput == 1)
    {
try{
    	int Width = 0;
    	int Length = 0;
    	System.out.println("Please enter width of Rectangle.");
    	Width = scn.nextInt();
    	scn.nextLine();
    	
    	System.out.println("Please enter Length of Rectangle.");
    	Length = scn.nextInt();
    	scn.nextLine();
    	
    	arr.add(new Rectangle(Width,Length));
    	
    	System.out.print("New Rectangle added successfully!!!");
}
catch (InputMismatchException e) {
    System.out.println("Oops!! Please enter only numbers");
    System.out.println("Press any key to continue...");
    scn.nextLine();
}
    }
    else if(UserInput == 2)
    {
    	String ConcatenateRectangles = "";
    	for(int i = 0; i< arr.size(); i++)
    	{
    		Rectangle rec = (Rectangle) arr.get(i);
    		ConcatenateRectangles += "Rectangle[Length: "+ rec.GetLength() +", Width:" + rec.GetWidth()+"] \n";
    	}
    	System.out.println("Rectangles: - \n");
    	System.out.println(ConcatenateRectangles);
    }
    else if(UserInput == 3)
    {
        Comparator cmp = new AreaComparer();
      
        Rectangle LargestRec = (Rectangle) GenericMethod.findMax(arr.toArray(), cmp);
    	
        System.out.println("Length of Largest Rectangle is: "+LargestRec.GetLength());
        System.out.println("Width of Largest Rectangle is: "+LargestRec.GetWidth());
    }
    else{
    System.out.println("Invalid option");
    }
    System.out.println("Press any key to continue... \n");
    scn.nextLine();
    main(args);

    
    

	
	
}
}

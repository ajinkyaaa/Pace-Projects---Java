package test1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {



	
	    private static Scanner s;

	    public static void main(String[] args) {
            String n, a[],b[];
            int i,j,l;
            System.out.println("Enter the string: ");
            s= new Scanner(System.in);
            n=s.nextLine();
            a=n.split("");
            l = a.length;
            for(i=0; i<l; i++){
                for(j=i+1; j<l; j++){
                    if(a[i].equals(a[j] )) {
                        System.out.println(a[i]);
                        
                        i = l;
                        j = l;
                    }
                }
            }
	    }
	     
	    public char letter;
	    public int index;
	

}



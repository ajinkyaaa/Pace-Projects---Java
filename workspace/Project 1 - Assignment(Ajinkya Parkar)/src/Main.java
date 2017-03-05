import java.util.Random;

public class Main {
	  public static void main(String[] args){

		    Random r = new Random(System.currentTimeMillis());
		    int n = r.nextInt(5);
		    
		    int[] a = new int[n];
		    for(int i = 0; i < n; i++)
		      a[i] = r.nextInt(5);
		    n = r.nextInt(5);
		   
		    int[] b = new int[n];
		    for(int i = 0; i < n; i++)
		      b[i] = r.nextInt(5);

		    //Create 2 objects of MyThreadSort class with two different int arrays.
		   MyThreadSort FirstThread = new MyThreadSort(a,1);
		   MyThreadSort SecondThread = new MyThreadSort(b,2);
		   
		   //Pass above class objects as parameters to 2 individual threads.
		    Thread t1 = new Thread(FirstThread);
		    Thread t2 = new Thread(SecondThread);  
		   
		    //Start the threads
	    	t1.start();
	    	t2.start();
		    try
		    {
		    	// Join thread to prevent merge thread running.
		    	t1.join();
		    	t2.join();
	
		    }
		    catch(Exception e){
		    	System.out.println("Error: " + e);
		    	System.exit(0);
		    }
		    
		    System.out.println("Thread Sort operation Finishes.\n" );
		    
		    System.out.println("Thread Merge operation Starts.\n" );

		    //Merge two thread result.
		    Thread t3 = new Thread(new MyThreadMerge(FirstThread.ArrayResult(),SecondThread.ArrayResult()));
		    
		    t3.start();
		    try
		    {
		     	t3.join();
		    
		    }
		    catch(Exception e){
		    	System.out.println("Error: " + e);
		    	System.exit(0);
		    }
		    
		  }

}

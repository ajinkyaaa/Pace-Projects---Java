import java.util.Arrays;

public class MyThreadSort extends Thread {

  //Create a variable to store sorted array and pass it to calling method as return function.
    int[] newArray = new int[200];
    
    int _threadNumber = 0;
	
	public MyThreadSort(int[] integers, int threadNumber){
		
		newArray = integers;
		_threadNumber = threadNumber;
	}
	
	
	public void run()
	{
		 System.out.println("Thread "+_threadNumber+" Started" );
				 
		    SortThread sortThrd = new SortThread(newArray);  //It is not a thread yet
		    System.out.println(Arrays.toString(sortThrd.get()));
		    
	}
	
	//Get function to retrieve sorted array result.
	public int[] ArrayResult()
	{
		return newArray;
	}
	
}

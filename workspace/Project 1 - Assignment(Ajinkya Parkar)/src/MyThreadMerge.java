import java.util.Arrays;

public class MyThreadMerge extends Thread {
	
	//Define variables to temporary store value and pass to merge thread method.
	int[] _a = new int[200];
	int[] _b = new int[200];

	public MyThreadMerge(int[] a,int[] b){
		
		_a = a;
		_b = b;
	}
	
	public void run()
	{
		System.out.println("Merge thread Finish!");
	    MergeThread m = new MergeThread(_a,_b);	
	    System.out.println(Arrays.toString(m.get()));
	}
	
}

//Generic class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Items<T> {
	  // T stands for "Type"
    private T t;
    private String ItemValues = "";
    private ArrayList<T> li = new ArrayList<T>();
	public Items(ArrayList<T> a)
	{
		li = a;
		
	}
  

    public void Insert(T t) { this.t = t; li.add(t); }
    public void Remove(T t) {
    	
    	li.remove(t);
    	
    	}
    
    public boolean IsPresent(T t)
    {
    	return li.contains(t);
    }
    
    public boolean IsEmpty()
    {
    	return li.isEmpty();
    			
    }
    
    public void MakeEmpty()
    {
    	li.removeAll(li);
    }
    
    @SuppressWarnings("unchecked")
	public T Get()
    {
    	for(T b : li)
    	{
    		if(b != null)
    		ItemValues += b+", ";
    	}
    	String ConcatenatedList =ItemValues.replaceAll(", $", "");
    	return (T)  (ConcatenatedList == ""?"List is Empty!":ConcatenatedList);
    }
    
    
}

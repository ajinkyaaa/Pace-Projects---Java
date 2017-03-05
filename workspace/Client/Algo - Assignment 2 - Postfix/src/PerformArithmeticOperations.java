import java.util.Stack;

public class PerformArithmeticOperations {

	public Stack Operation(Stack stk, char operator)
	{
	int output = 0;
    switch(operator)		
    {
	    case '+': 
	    	{
	    		
	    		int last = (int) stk.pop();
	    		int secondLast = (int) stk.pop();
	    		
	    		output = last + secondLast;
	    		
	    		stk.push(output);
	    		
	    		break;
	    	}
	    case '-': 
		{
			int last = (int) stk.pop();
    		int secondLast = (int) stk.pop();
			output = secondLast - last;
			stk.push(output);
			break;
		}
	    case '*': 
		{
			int last = (int) stk.pop();
    		int secondLast = (int) stk.pop();
			output = last * secondLast;
			stk.push(output);
			break;
		}
	    case '/': 
		{
			int last = (int) stk.pop();
    		int secondLast = (int) stk.pop();
			output = secondLast / last;
			stk.push(output);
			break;
		}
	     default: 
		{
			
			break;
		}
		
	    	
	    }
    return stk;
	}
}

public class MyQuickSort{
	
	public void QuickSort(int[] arr,int lowerIndex,int higherIndex)
	{
	
		int pivotIndex = arr.length - 1;;
		while(lowerIndex < higherIndex)
		{
			while(arr[lowerIndex] < arr[higherIndex])
			{
				if(arr[higherIndex] > arr[pivotIndex])
				{
					ExchangeNumbers(arr,higherIndex,pivotIndex);
					pivotIndex--;
				}
				higherIndex--;
				
			}
			

			while(arr[lowerIndex] > arr[higherIndex]){
				ExchangeNumbers(arr,lowerIndex,higherIndex);
				if(arr[higherIndex] > arr[pivotIndex])
				{
					ExchangeNumbers(arr,higherIndex,pivotIndex);
					pivotIndex--;
				}
				lowerIndex++;
				higherIndex--;
			}
			
			if(arr[lowerIndex] == arr[higherIndex])
			{
				higherIndex--;
			}
		
		
		}
		QuickSort(arr,0,pivotIndex-1);
		
	}
	
	public void ExchangeNumbers(int[] arr,int lowerIndex,int higherIndex)
	{
		int temp =  arr[lowerIndex];
		arr[lowerIndex] = arr[higherIndex];
		arr[higherIndex] = temp;
		
				
	}
}
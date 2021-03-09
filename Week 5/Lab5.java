public class Lab5
{
	public static void main( String args[] )
	{
		int[] arr = { 13, 5, 7, 11, 23, 15, 6, 31, 91, 27, 14, 41, 55, 14 };
		int arrmin = 1,arrmax = 1;
		//As it turns out, the product exceeds the largest number java can store as an int, and thus long int must be used for arrprod.
		long arrprod = 1;
		double arrave = 0;
		for ( int i=0 ; i<arr.length ; ++i ) //Sample loop that will process through an entire array.
		{
			//This first if statement is used to initially the minimum and maximum values in the array so that the program won't always return 1 as min or max.
			if (i == 0){
				arrmin = arr[i];
				arrmax = arr[i];
			}
			//This second if statment runs from array position 1-12 since position 13 is last and adding 1 to it goes out of bounds of the array.
			//In C, this if statement would execute without error but would collect other data from memory if the position of the array is at 13.
			else if(i > 0 && i < arr.length - 1)
			{
				if(arr[i] < arr[i+1] && arr[i] < arrmin){
					arrmin = arr[i];
				}
				if(arr[i] > arr[i+1] && arr[i] > arrmax){
					arrmax = arr[i];
				}
			}
			else if (i == arr.length - 1)
			{
				if(arr[i] < arrmin){
					arrmin = arr[i];
				}
				if(arr[i] > arrmax){
					arrmax = arr[i];
				}
			}
			arrave += arr[i];
			arrprod = arrprod *arr[i];
		}
		arrave = arrave/arr.length;
		System.out.println( "The smallest number in the array is: " + arrmin);
		System.out.println( "The largest number in the array is: " + arrmax);
		System.out.println( "The average of the numbers in the array is: " + arrave);
		System.out.println( "The product of the numbers in the array is: " + arrprod);
		
		
	} // END MAIN METHOD
	
	
	
} // END CLASS Lab5

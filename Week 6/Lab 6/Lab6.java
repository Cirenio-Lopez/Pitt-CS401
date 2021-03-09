/*
We will use this lab to expand our abilities with arrays and serve as an intro to methods. A method is a way to move code out of main to a callable
location where the section of code can be called from anywhere within your program. A method can directly call to any other method in the class.
Two methods are already complete and accessible to be called, printArray and upsize.
A method is 2 parted, a definition which will contain what values(arguements) can be sent into the method for it to use and all commands it performs
AND the CALL to the method. The call will activate that method.
The arrays will be the main focus in the lab. We will need to overcome one of the oldest limition of arrays in java, their immutability of size. 
Arrays CANNOT change their size after being declared, so we are limited in our ability to use them,too small or too large will always be our problem
We work smarter! Java wont allow the array itself to change, we need to go around the rules instead of breaking them. Java allows a name of an array to switch its
targeted addresses in memory, meaning if we pull a slight of hand on java and switch the name of the array to a different array it won't know the difference
We have an upsize method already built which will take an existing array in, it will double the size(see lecture vid for an explanation why)
It will create an array double the size of the current array, it will then copy over all values from the original array into the larger one - then give it back
printArray method will go through a whole array and output all of its values to the interface.

Mission for Lab6: Build out the downsize method at the bottom of the source. We dont want extra empty spaces in our array by the end. Its inefficient and
potentially a problem if we use that array as a datasource for other purposes.
What to hand in? Java source file. Also, run the program and give it 3 values only, show the results of the printArray on the command line. Then, 
give it enough values to require at LEAST 1 upsize
Make sure you arent seeing trailing zeros which would indicate empty places in the array. If you give it 5 values(say 1,2,3,4,5) your output should look like
> 1 2 3 4 5 
> The amount of values in the arrays that we care about is: 5
NOT
> 1 2 3 4 5 0 << if you gave it only 5 values, we shouldnt see these trailing empty values
> The amount of values in the arrays that we care about is: 5

*/
import java.util.Scanner;
public class Lab6 {
    public static void main(String args[]) {
      int[] myarray = new int[3]; // array is initially set to 3 spaces in length 
      int count=0; //number of values we place in the array, initially, its 0 - no real values
      int limit,limitcount =1;
      Scanner kbd = new Scanner(System.in);
      System.out.print("How many values would you like to enter? ");
      limit = kbd.nextInt(); // this will control the loop asking for input to supply only the needed requests for values
      
      while (limitcount <= limit)
      {
          System.out.println("enter an int value ");
          int input = kbd.nextInt();
          limitcount++; //increment the loop counter
          if (count < myarray.length) // we need to know if the count is less than the length to determine is empty space exists in the array
          {
              myarray[count] = input; // if space exists, put the value entered into the next empty space
              
          }
          else // if test failed, it means we have a filled array! We need more space, arrays themselves are immutable in size(unchanging), if we cant beat it we gotta go around it!
          {
              myarray = upsize(myarray); // we send in the current array and redefine it with the new array upsize will build, we didnt change the actual array, we retarget which address it speaks to
              myarray[count] = input; // once we have more space, we put the value into the proper place
          }
          count++; //this increments the number of values in the array
              
      }
      
      //############ place call to downsize here //we need to send in the array to downsize AND the count, count tells the downsize the needed size
      myarray = downsize(myarray, count);
      printArray(myarray);
      System.out.println("The amount of values in the arrays that we care about is: " + count);
    }
    // upsize method with take the arrays current size and double it. Why double?
    static int[] upsize(int[] array){
        int[] bigger = new int[array.length * 2];
		for (int i =0;i<array.length; i++)
            bigger[i] = array[i];
        return bigger; // the address in memory for this array will return back from the method and replace the address listed for the original
    }
    //printArray method will cycle through every value of an array and print it out to the command line(terminal)
    static void printArray( int[] array )
    {
        for ( int number : array ) // enhance for loop, : operator is the "set operator"
            System.out.print( number + " ");
        System.out.println();
		//notice there is no return here? void means no datatype for return, no data will come out of this method, its a one way trip
    }
    // You will need to build the downsize method to eliminate unused space in the array from the upsize operation.
    static int[] downsize(int[] array,int count){
        // create your new smaller array based on the count size
        int[] smaller = new int[count];
        // use a loop like upsize did, however, your test condition can NOT be based on array.length
        for (int i =0; i<count; i++)
            smaller[i] = array[i];
            // inside the loop 
        return smaller; // this is only here to allow your code to compile, it is not a proper downsized array. Replace with your smaller array
    }
}
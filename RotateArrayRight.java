import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateArrayRight {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int temp = 0;
		int j = 1;
		int k = 3;
// 		full reverse
		for (int i=0;i<n/2; i++){
		    temp = arr[i];
		    arr[i] = arr[n-j];
		    arr[n-j]=temp;
		    j++;
		    
		    
		} 
		
		System.out.print(Arrays.toString(arr));
		System.out.println(" ");
// 		first k element reverse
int m = 1;

      for(int i=0;i<k-1;i++){
          temp = arr[i];
		    arr[i] = arr[k-m];
            arr[k-m]=temp;
		    m++;
      }
      System.out.print(Arrays.toString(arr));
      
      System.out.println(" ");
      
      int l = 1;
      
      for (int i=k;i < k + (n - k) / 2;i++ ) {
          temp = arr[i];
		    arr[i] = arr[n-l];
		    arr[n-l]=temp;
		    l++;
          
      }
      
       System.out.print(Arrays.toString(arr));

    
}
    }

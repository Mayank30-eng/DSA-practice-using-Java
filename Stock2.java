import java.util.*;
import java.lang.*;
import java.io.*;

public class Stock2 {
     public static int Stock2(int arr[]){
        int total = 0;
        int n = arr.length;
        for (int i=0;i<n-1;i++ ) {
            if (arr[i+1]>arr[i]){
                total += arr[i+1] - arr[i];
                
            } 
        }
        return total;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr [] = {7,6,4,3,1};
		
		System.out.println(Stock2(arr));
		

	}
    
}

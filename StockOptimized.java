import java.util.*;
import java.lang.*;
import java.io.*;
public class StockOptimized {

    public static int Stock(int arr[]){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int i = 0;
        for (int j=1;j<n ;j++ ){
            int diff = arr[j] - arr[i];
            if (diff>max) {
                max = diff;
                i++;
            }
            
        } 
    
        if(max<0){
            return 0;
        }
        return max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {7,1,5,3,6,4};
		System.out.println(Stock(arr));
		

	}
    
}

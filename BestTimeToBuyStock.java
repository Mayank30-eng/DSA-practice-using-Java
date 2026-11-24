import java.util.*;
import java.lang.*;
import java.io.*;
public class BestTimeToBuyStock {
    public static int Stock(int arr[],int n){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n-1 ;i++ ){
            for(int j=i+1;j<n;j++){
                int diff = arr[j]-arr[i];
                if(diff>max){
                    max = diff;
                }
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
		int arr[] = {7,6,4,3,1} ;
		int n = arr.length;
		System.out.println(Stock(arr,n));
		

	}
}

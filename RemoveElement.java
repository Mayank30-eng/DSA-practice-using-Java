import java.util.*;
import java.lang.*;
import java.io.*;


public class RemoveElement {
    public static int Remove(int nums[],int val){
        int k = 0;
        for (int i=0;i<nums.length ;i++ ){
            if (nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            
        } 
        for(int n:nums){
            System.out.print(n +" ");
        }
        return k;
        
    }

    public static void main (String[] args) throws java.lang.Exception
	 {
	    int nums [] = {0,1,2,2,3,0,4,2};
	    int val = 2;
	    System.out.println(Remove(nums,val));
	    
		// your code goes here

	}


    
}

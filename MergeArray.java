import java.util.*;
import java.lang.*;
import java.io.*;
public class MergeArray {
     public  static void Merge(int[] nums1, int[] nums2, int m, int n){
        int j = 0;
        for (int i=m;i<nums1.length ;i++ ){
            nums1[m] = nums2[j];
            m++;
            j++;
        } 
        Arrays.sort(nums1);
        for(int nume:nums1){
            System.out.print(nume+"  ");
        }
        
        
    }

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int nums1[] = {1,2,3,0,0,0} ;
		int m = 3;
		int nums2 [] = {2,5,6}; 
		int n = 3;
		Merge(nums1,nums2,m,n);

	}

    
}



    
   
	


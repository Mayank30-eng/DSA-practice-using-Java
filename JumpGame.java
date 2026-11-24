import java.util.*;
import java.lang.*;
import java.io.*;
public class JumpGame {
    public static boolean JumpGame(int arr[]){
        int n = arr.length;
        int maxReach = 0;
        for (int i=0;i<n;i++ ) {
            if(i>maxReach){
                return false;
            }
            maxReach = Math.max(maxReach,i+arr[i]);
            if(maxReach>=n-1){
                return true;
            }
            
        }
        return false;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr [] = {0, 2, 3};
		System.out.print(JumpGame(arr));

	}
    
}

//  mine approach which is not working for all test cases 
// public static boolean Jump(int arr []){
//         int n = arr.length;
//         for (int i=0;i<n-1 ; i++){
//             if(i+arr[i]>=n-1){
//                 return true;
//             }
//         } 
//         return false;
        
//     }

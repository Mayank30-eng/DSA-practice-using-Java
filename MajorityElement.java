public class MajorityElement {
     public static int MajorityElements(int nums[] ,int n){
        int candidate = 0;
        int count = 0;
        int gt = n/2;
        for (int i=0;i<n ;i++ ){
            
            if(count==0){
         candidate = nums[i];
               count=1;
                  } else if(candidate == nums[i]){
                      count++;
                           } else{
                              count--;
                                     }
            // if (count==0){
            //     candidate = nums[i];
            //     count++;
            // } 
            // else{
            //     count--;
            // }
        } 
       
        return candidate;
    }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int nums[] = {2,2,1,1,1,2,2,1,5,5,5,5,5,5};
        	int n = nums.length;
		System.out.println(MajorityElements(nums,n));
    }
		
    
}

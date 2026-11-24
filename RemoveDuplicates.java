import java.util.HashSet;

public class RemoveDuplicates{
    public static int RemoveD(int arr[]){
        HashSet<Integer> unique = new HashSet<>(); 
        for (int n:arr ){
            unique.add(n);
        }
        
        return unique.size();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]={1,1,1,2,2,3,3,3,3,4,4};
		System.out.println(RemoveD(arr));
		

	}
}

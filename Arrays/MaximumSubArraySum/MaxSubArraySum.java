import java.util.ArrayList;

//This code contains the solution to return a continous array with sum provided to the function.
public class SubArraySum {

	public static void main(String[] args) {
		=int[] intArray=new int[] {23,2,6,4,7};
		//ArrayList<Integer> subArrayList=subarraySum (intArray, 5, 12);
		System.out.println(checkSubarraySum(intArray,6));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	{
		ArrayList<Integer> subArrayList=new ArrayList<Integer>();
		if (arr==null|| arr.length<=1||s<=0) {
			return subArrayList;
		}
		int subArraySum=0;		
		for (int i = 0; i<n; i++) {
      //Get ith element to compare it with other elements in array.    
			subArraySum=arr[i]; //Intialise the array sum with the ith element	    
			for (int j = i+1; j < n; j++) {
				subArraySum=subArraySum+arr[j];// Calculate sum with ith element and other successive elements in array.
				if (subArraySum==s) //Sum found.Return indexes(index+1,to return the actual position of element in array).
        {
					subArrayList.add(i+1);
					subArrayList.add(j+1);
					return subArrayList;//Break the flow and return the output arraylist with the actual positions of the conitnous array elements.
				}
			}
		}
		return subArrayList;
	}

	public static boolean checkSubarraySum(int[] nums, int k) {
		boolean sumExists=false;
		if (nums==null|| nums.length<=1||k<=0) {
			return sumExists;
		}
		int subArraySum=0;	
		int n=nums.length;
		for (int i = 0; i<n; i++) {
			subArraySum=nums[i];
			for (int j = i+1; j < n; j++) {
				subArraySum=subArraySum+nums[j];				
				if (subArraySum==k) {
					return true;
				}
			}
		}        
		return sumExists;
	}

}
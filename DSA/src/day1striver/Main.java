package day1striver;

public abstract class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,3,5,6};
		int K=3;
		int N=A.length;		//System.out.println(lenOfLongSubarr(A, N, K));
		System.out.println(searchInsert(A,K));

}
	
    public static int searchInsert(int[] nums, int target) {
        
        return binarySearch(nums,0,nums.length-1,target);
   }

    public static int binarySearch(int arr[],int start,int end,int target){

       if(start>end){
           return start;
       }
       int mid=(start+end)/2;

       if(arr[mid]==target)
           return mid;
       else if(arr[mid]>target){
           return binarySearch(arr,0,mid-1,target);
       }else if(arr[mid]<target){
           return binarySearch(arr,mid+1,end,target);
       }
       return end+1;
  
}
}
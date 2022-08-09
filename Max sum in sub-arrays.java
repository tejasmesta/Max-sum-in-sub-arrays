class Solution {
    
    public static long pairWithMaxSum(long arr[], long n)
    {
        long sum=0,maxSum=Integer.MIN_VALUE ;
        
        if(arr.length<=1){
            return 0;
        }
        
        for(int i=0;i<arr.length-1;i++)
        {
            sum=arr[i]+arr[i+1];
            maxSum=Math.max(sum,maxSum);
        }
        
        return maxSum;
    }
}

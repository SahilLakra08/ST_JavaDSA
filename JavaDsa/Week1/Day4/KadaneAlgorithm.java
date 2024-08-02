package Week1.Day4;
//KADANE'S ALGORITHM for ARRAY: TO FIND MAXIMUM SUM OF SUB ARRAY
public class KadaneAlgorithm {
    
    int KadaneAlgo(int[]arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0)
            currSum=0;
        }
        return maxSum;
    }
    public int maxSubArray(int[]nums){
        return KadaneAlgo(nums);
    }
}

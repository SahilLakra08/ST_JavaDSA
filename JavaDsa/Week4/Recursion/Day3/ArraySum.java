package Day3;
public class ArraySum {  
    static int sum=0; static  void arrSum(int arr[],int i,int k){
        if(i==arr.length)return;   
        sum+=arr[i];
        if(k<sum){
            sum-=arr[i];
            return;    
        }
        arrSum(arr, i+1,k);
    }
//THIS IS CALLED BACK TRACKING:
    //1.FUNCTION WILL RETURN A BOOLEAN VALUE.
    static boolean backTrackSumArray(int[]arr,int i,int k){
        //base case:
        if(i==arr.length)return true;
        if(sum>k)return false;
        //
        //INCLUDE CURRENT VALUES IN ANS
        sum+=arr[i];
        //check if this can be included in final answer
        if(!backTrackSumArray(arr, i+1, k)){
            sum-=arr[i];
        }
        return true;
    }
   
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        
        arrSum(arr, 0, 14);
        System.out.println(sum);
        System.out.println(backTrackSumArray(arr,0,0));
    }  
}

package Week3.Day1;
import java .util.Arrays;
public class Arrays2D {
    static int[]flatArray(int[][]arr){
        int rows=arr.length,cols=arr[0].length;
        int[]nums=new int[rows*cols];
            for(int i=0;i<rows;i++)
                for(int j=0;j<cols;j++){
                   nums[arr[0].length*i+j]=arr[i][j]; 
            }
            return nums;
    }
    static void fillArray(int[][]arr,int[]nums){
        for(int i=0;i<nums.length;i++){
        arr[i/arr[0].length][i%arr[0].length]=nums[i];
        }
    }

    static void display(int[]nums){
    for(int i:nums)
    System.out.print(i+" ");
    System.out.println();
    }
    static void display2D(int[][]arr){
        for(int i=0 ; i<arr.length;i++)
        display(arr[i]);
    }
    public static void main(String[] args) {
        int[][]arr={
                    {9,2,3},
                    {4,2,6},
                    {7,8,4},
                    {1,14,12}
                };
        int[]nums=flatArray(arr);
        display(nums);
        fillArray(arr, nums);
        Arrays.sort(nums);
        display2D(arr);
    } 
}

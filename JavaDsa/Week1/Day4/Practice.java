package Week1.Day4;


 
public class Practice {

  /*ARRAY IS GIVEN FOR EG:
|1|2|3|4|5|6|7|
SO ROTATE BY 1 WHICH MEANS
|7|1|2|3|4|5|6|
*/
  
  /*   public static void RotatedByOne(int[]arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        arr[i]=arr[i-1];
   arr[0]=temp;
    }
   */
  
 /*   public static void RotatedByOne(int[]arr){
    int temp=arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--)
    arr[i]=arr[i-1];
arr[0]=temp;
}
*/
   

//ROTATE ARRAY "K" TIMES:
/*
 * public void rotate(int[] nums, int k) {
        int[]arr=new int[nums.length];
        for(int i=0;i<arr.length;i++)
        arr[(i+k)%arr.length]=nums[i];
        //Shallow copy
        //nums=arr;
        //Deep copy
        for(int i=0;i<arr.length;i++)
        nums[i]=arr[i];

    }
 */




//REVERSE THE ARRAY FROM ONE PARTICULAR INDEX TO ANOTHER GIVEN BY USER

public static void reverseArray(int arr[]) {
  int i=0,j=arr.length-1;
  while(i<j)
  change(arr,i++,j--);
}
static void change(int[]arr,int i,int j){
  int temp=arr[i];
  arr[i]=arr[j];
  arr[j]=arr[i];

}
static void print(int[]arr){
  for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]+" ");
  System.out.println();
}
public static void main(String[] args) {
  int a=10;
  int b=15;
  int[]arr={1,2,3,4,5,6,7,8,9};
  reverseArray(arr);
      print(arr);
  
}


// REVERSE THE ARRAY AND THEN ROTATE THE ARRAY GIVEN BY USER
class Solution {
  public void reverse(int[]nums,int i,int j) {
      //REVERSE
      while(i<j){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
          i++;
          j--;
      }
  }
  public void rotate(int[]nums,int k){
      //reverse(nums,2,4);
      k%=nums.length;
      reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
  }
}

}
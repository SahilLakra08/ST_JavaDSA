package Week1.Day3;
import java.util.Arrays;
import java.util.Collection;
public class SelectionSort {
    //Find the minimum element from an array:
  /*  static int minimumValue(int[]arr){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        mini=Math.min(mini,arr[i]);
        return mini;
    }*/
    //ALSO FIND THE MINIMUM ELEMENT INDEX FROM ARRAY:
/* 
    static int minimumValuE(int[]arr){
        int mini=0;
        for(int i=1;i<arr.length;i++)
       if(arr[mini]>arr[i])
       mini=i;
        return mini;
    }
    max(Arrays.asList(arr));
*/
   /*  public static void main(String[] args) {
        int[]arr={11,23,3,4,5};
       //int min=Collection.max(Arrays.asList(arr));
        System.out.println(minimumValue(arr));
        */
   
        //SELECTION SORT
        static void selectionSort(int[]arr){
            for(int i=0;i<arr.length;i++){
                int idx=minimumValue(arr,i);
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
   
    }


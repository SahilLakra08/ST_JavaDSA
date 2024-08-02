package Week1.Day3;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class BinarySearch {
    //BINARY SEARCH
    /*
    static boolean binarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
            return true;
            if (arr[mid]>key)
            end=-mid-1;
            else
                start=mid+1;
            
        }
        return false;
    }
    //RETURN THE INDEX
    
static int binarySearCh(int arr[],int key){
    int start=0,end=arr.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==key)
        return mid;
        if (arr[mid]>key)
        end=-mid-1;
        else
            start=mid+1;
        
    }
    return -1;
}
    */


//LOWER BOUND SEARCH
/* 
    static int lowerBound(int arr[],int key){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
       else if (arr[mid]>key)
            end=-mid-1;
            else            
                start=mid+1;
            }
        return ans;
    
    }
*/


//UPPER BOUND:

/*static int upperBound(int arr[],int key){
    int start=0,end=arr.length-1;
    int ans=-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==key){
            ans=mid+1;
            start=mid+1;
        }
   else if (arr[mid]>key)
        end=mid-1;
        else            
            start=mid+1;
        }
    return ans;

}
public static void main(String[] args) {
    int[]arr={1,2,5,5,5,4,4,4,4,5,7};
    Arrays.sort(arr);
    System.out.println();
    System.out.println(upperBound(arr,5 ));

}    */
}

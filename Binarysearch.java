package sortingandsearc;

public class Binarysearch {
    public static int search(int arr[],int x){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;

        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){
            s= mid+1;
        }
        else if(arr[mid]>x){
            e=mid-1;
        }
    }
    return-1;
        
}
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int x = 4;
       int  result = search(arr, x);
       System.out.println("Element "+ x + " present at index "+ result);
        
    }
}

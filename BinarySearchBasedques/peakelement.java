package sortingandsearc;

public class peakelement {
    public static int peak(int arr[]){
     int s=0; 
     int e = arr.length-1;
     int mid = s+(e-s)/2;
     while(s<e){
        if(arr[mid]<arr[mid+1]){
            s = mid+1;
        }
        else{
            e = mid;
        }
        mid = s+(e-s)/2;
     }
     return s;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,6,4,3,5};
        System.out.println("Index of peak point at "+peak(arr));
    }
}
// time complixity is O(logN).
// space complixity is O(1).

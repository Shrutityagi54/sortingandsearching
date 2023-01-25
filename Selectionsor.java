package sortingandsearc;

public class Selectionsor {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
     int arr[] = {7,8,3,1,2};
     for(int i=0;i<arr.length;i++){
        int smallest = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest = j;

            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i]= temp;
     
        }
        print(arr);

    }
}
// time complexity is O(n square)
// In selection sort- repeatedly finding the mininum element from unsorted part and putting it at the bigning .
//  This algorithm maintain two subarray in a given array.ek iteration pr ek hi swapping hogi
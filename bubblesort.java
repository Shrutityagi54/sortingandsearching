package sortingandsearc;

public class bubblesort {
    public static void printarray(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j]= arr[j+1];
                  arr[j+1]= temp;
                }
            }
        }
        printarray(arr);
    }
}// repeatedly swapping the adjacent element ,this algorithm is not suitable for largest element
//bubble sort me sbse bade element ko last me pocha dege
// time complexit is O(n square)

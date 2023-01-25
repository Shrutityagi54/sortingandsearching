package sortingandsearc;

public class insertionsort {
    public static void printarray(int arr[]){
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }
    }

    public static void main(String[] args) {
        int arr[] = {10,1,7,4,8,2,11};
        for(int i=1;i<arr.length;i++) {// i ko 1 se start isliye kiya hai kyuki 0th element ko sort maan liya
         int current = arr[i];
         int j = i-1;
         while(j>=0  && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
         }arr[j+1]=current;
    }
    printarray(arr);
    
}
}
//insertion sort me swap nhi krte , elememt of shift krte hai
//time complixity = big o n square.
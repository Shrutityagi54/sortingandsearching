package sortingandsearc;

public class Mergesort {
    public static void conquer(int arr[],int s, int mid ,int e){
     int merged[] = new int [e-s+1];// e-s+1 5-0+1 = 6 merged array length.
     int idx1 = s; //track first array index
     int idx2 = mid+1; // track second array index
     int x =0; // track merged array index

     while(idx1<=mid && idx2<=e){
        if(arr[idx1]<=arr[idx2]){
           merged[x++] = arr[idx1++];
        }
        else{
            merged[x++] = arr[idx2++];
        }
     }
    // after comparision remaining element ko merged array me dal dege.
     // dono me se ek condition chalegi
     while(idx1<=mid){ 
        merged[x++] = arr[idx1++];
     }
     while(idx2<=e){
        merged[x++]= arr[idx2++];
     }
     for(int i=0,j=s; i<merged.length;i++,j++){
         arr[j] = merged[i];
     }
    

    }
   
    public static void divide(int arr[],int s, int e){
        if(s>=e){
            return;
        }

        int mid = s+(e-s)/2;
        divide(arr, s, mid); // divide array in two parts
        divide(arr, mid+1, e);
        conquer(arr,s,mid,e);// conquer two divided array
    }

public static void main(String[] args) {
    int arr[] = {7,8,9,3,1,2};
    int n = arr.length;
    divide(arr, 0, n-1);
    // print array
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}


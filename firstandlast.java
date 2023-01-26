package sortingandsearc;

public class firstandlast {
    
    public static int firstoccurence(int arr[], int key){
        int s=0;
        int e= arr.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==key){
                ans = mid;
                e = mid-1;
             
            }
            else if(key>arr[mid]){  // right me jao
              s= mid+1;
            }
            else if(key<arr[mid]){ // left me jao
                e = mid-1;
            }
           
        }
        
        return ans;
    }
    public static int lastoccurenece(int arr[],int key){
        int s=0;
        int e= arr.length-1;
        int ans =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==key){
                ans = mid;
                s = mid+1;
             
            }
            else if(key>arr[mid]){  // right me jao
              s= mid+1;
            }
            else if(key<arr[mid]){ // left me jao
                e = mid-1;
            }
            
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,4,7,8,8};
        int key = 2;
         System.out.println("first occurence of 2 at index "+firstoccurence(arr, key));
         System.out.println("last occurence of 2  at index "+lastoccurenece(arr, key));
        

    }
}

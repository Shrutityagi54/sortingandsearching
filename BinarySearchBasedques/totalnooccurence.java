package sortingandsearc;

public class totalnooccurence {
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
        int arr[] = {1,2,3,3,3,3,5};
        int key = 3;
        int total = (lastoccurenece(arr, key)-firstoccurence(arr, key))+1;
        System.out.println(total);
        

    }
}



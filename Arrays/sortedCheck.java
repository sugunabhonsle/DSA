class Solution{
    public static boolean schecked(int[] arr, int n){
       for(int i=1;i<n;i++){
        if(arr[i]>=arr[i-1]){
        }
        else 
            return false;
       }
       return true;
       
    }
}

public class sortedCheck{
    public static void main(String[] args) {
            // Array of elements
            int[] arr = {1,2,3,4,5};
    
            // Calculate the size of the array
            int n = arr.length;
    
           
            boolean sorted = Solution.schecked(arr, n);
    
            // Output the results
            if(sorted == true)
             System.out.println("sorted");
            else System.out.println("Unsorted");
        }
    }
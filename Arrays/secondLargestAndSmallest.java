
class Solution {
    public static int secondLargest(int[] arr, int n){

      int largest=arr[0], sLargest=0;
      for(int i=1;i<n;i++){
        if(largest<arr[i]){
           sLargest = largest;
          largest= arr[i];
            
        }            
        else if(largest>arr[i] && sLargest<arr[i])
            sLargest= arr[i];
      }
      return sLargest;
    }

    public static int secondSmallest(int[] arr, int n){

    int smallest = arr[0], sSmallest= Integer.MAX_VALUE;
      for(int i=1;i<n;i++){
        if(smallest>arr[i]){
          sSmallest= smallest;
          smallest= arr[i];
        }
           
        else if(smallest<arr[i] && sSmallest>arr[i])
            sSmallest= arr[i];
      }
      return sSmallest;
    }
}
public class secondLargestAndSmallest{
public static void main(String[] args) {
        // Array of elements
        int[] arr = {5, 1, 2};

        // Calculate the size of the array
        int n = arr.length;

        // Find the second smallest and second largest elements
        int sSmallest = Solution.secondSmallest(arr, n);
        int sLargest = Solution.secondLargest(arr, n);

        // Output the results
        System.out.println("Second smallest is " + sSmallest);
        System.out.println("Second largest is " + sLargest);
    }
}
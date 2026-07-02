class Solution {
    public static boolean check(int[] nums) {
            int n=nums.length, count =0;
            for(int i=1;i<n;i++){
              if(nums[i-1]>nums[i])
               count++;
            }
        if(nums[n-1]>nums[0])
          count++;
        if(count<=1)
           return true;
        return false;
        }
       
    }
    
    public class Sortedandrotated {
        public static void main(String[] args) {
            // Array of elements
            int[] arr = {2,1,3,4};
           
            boolean ans = Solution.check(arr);

        // Output the results
        if(ans)
         System.out.println("True");
        else System.out.println("False");
    }
}

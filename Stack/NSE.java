// Next Smaller Element
// Given an array of integers arr, your task is to find the Next Smaller Element (NSE) for every element in the array.
// The Next Smaller Element for an element x is defined as the first element to the right of x that is smaller than x.
// If there is no smaller element to the right, then the NSE is -1.
// Example 1
// Input: arr = [4, 8, 5, 2, 25]
// Output: [2, 5, 2, -1, -1]

import java.util.Stack;

class Solution{
    public static int[] nextSmallerElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int []res = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.empty() && arr[i]<=st.peek()){
                st.pop();
            }
         if(st.empty())
            res[i]=-1;
        else{
            res[i]=st.peek();
        }
        st.push(arr[i]);
         
        
        }
        // for(int j=0;j<res.length;j++){
        //     System.out.print(res[j]+" ");
        // }
        return res;
    }
   
}

public class NSE {
    public static void main(String[] args) {
    int[] arr = {1, 3, 2, 4};
    int []res = new int[arr.length];
    
    System.out.println("Output array");
    res = Solution.nextSmallerElements(arr);
    for(int val : res){
        System.out.print(val+" ");
    }
    }
}

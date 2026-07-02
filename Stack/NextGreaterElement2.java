// 503. Next Greater Element II
// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
// The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

// Example 1:

// Input: nums = [1,2,1]
// Output: [2,-1,2]

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int []ans = new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.empty() && nums[i%nums.length]>=st.peek())
               st.pop();
            if(i<nums.length){
                ans[i] = st.empty()?-1:st.peek();
            }
            st.push(nums[i%nums.length]);
        }
        return ans;
    }
}
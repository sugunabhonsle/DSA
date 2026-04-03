// 496. Next Greater Element I
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
// You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
// Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

// Example 1:
// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

//Approach - 1
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int []ans = new int [nums1.length];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        
       for(int i=nums2.length-1;i>=0;i--){
        while(!st.empty() && nums2[i]>=st.peek()){
          st.pop();
       }
       if(st.empty())
          hashMap.put(nums2[i],-1);
        else
          hashMap.put(nums2[i],st.peek());

        st.push(nums2[i]);
    
    System.out.println(hashMap.get(3));
    
  }
  for(int i1=0;i1<nums1.length;i1++){
        ans[i1]=hashMap.get(nums1[i1]);
    }

// Approach - 2
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
int[] ans = new int[nums1.length];

	Stack<Integer> stack = new Stack<>();
	HashMap<Integer, Integer> map = new HashMap<>();

	// find out all the next greater elements in nums2 array
	for(int num: nums2) {
		// if num is greater than top elements in stack then it is the next greater element in nums2
		while(!stack.isEmpty() && num > stack.peek()) {
			map.put(stack.pop(), num);
		}
		// then add num to stack
		stack.add(num);
	}

	int i = 0;
	for(int num : nums1) {
		ans[i++] = map.getOrDefault(num, -1);
	}
return ans;
}
}

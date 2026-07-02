import java.util.Stack;

class Solution{
    

    public static int[] nextGreaterElement(int[] arr, int[] indices) {
        Stack<Integer> st = new Stack<>();
        int []res = new int[indices.length];
        for(int i=0;i<indices.length;i++){
            int count = 0;
            st.clear();
            for(int j=indices[i];j<arr.length;j++){
                while(!st.empty() && arr[j]>=st.peek()){
                    st.pop();
                    count++;
                }
                st.push(arr[j]);
            }
            res[i] = count;
        }
        return res;   
}
}

public class NextGreaterElementtoRight {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 1};
    int[] indices = {0, 3}; 
    int[] res = new int[indices.length];
    System.out.println("Output array");
    res = Solution.nextGreaterElement(arr,indices);
    for(int val : res){
        System.out.print(val+" ");
    }
    }
}

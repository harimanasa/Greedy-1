// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public boolean canJump(int[] nums) {
        int lastPosition=nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(i+nums[i]>=lastPosition){
                lastPosition=i;
            }
        }
        return lastPosition==0;
    }
}

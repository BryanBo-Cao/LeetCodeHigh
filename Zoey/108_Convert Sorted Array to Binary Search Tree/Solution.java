/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode head = helper(nums,0,nums.length-1);
        return head;
    }

    public TreeNode helper(int[] nums,int start,int end){
        if(start>end) return null;
        int mid = start+(end-start)/2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left=helper(nums,start,mid-1);
        head.right=helper(nums,mid+1,end);
        return head;
    }
}
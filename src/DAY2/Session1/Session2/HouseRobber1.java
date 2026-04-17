package DAY2.Session1.Session2;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class HouseRobber1 {
    public static int rob(TreeNode root){
        int[] result=dfs(root);
        return Math.max(result[0],result[1]);
    }
    public static TreeNode buildTree(Integer[] arr){
        if(arr.length==0){
            return null;
        }
        TreeNode root=new TreeNode(arr[0]);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<arr.length){
            TreeNode curr =q.poll(); //poll-take out, offer
            if(arr[i]!=null){
                q.add(curr.left);
            }
            i++;
            if(i<arr.length && arr[i]!=null){
                curr.right=new TreeNode(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
    public static int[] dfs(TreeNode node){
        if(node== null){
            return new int[]{0,0};
        }
        int[] left=dfs(node.left);
        int[] right=dfs(node.right);
        int notRob=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        int rob=node.val+left[0]+right[0];
        return new int[]{notRob,rob};
    }
    public static void main(String args[]){
        Integer arr[]={3,2,3,null,3,null,1};
        TreeNode root=buildTree(arr);
        System.out.println(rob(root));
    }
}
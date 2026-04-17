package DAY1.Session2;

public class Jumping {
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int maxReach=0;
        for(int i=0;i<n;i++){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach, i+nums[i]);
            if(maxReach>=n-1){
                return true;
            }//1,0,1,0,1,1  will it work for it?
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={2,0,1,1,1};
        System.out.println(canJump(nums)); //mc karthy 91 problem // moore voting problem
    }
    
}

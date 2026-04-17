package DAY3.Session3;

public class TargetSum494 {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum<target || (sum-target)%2!=0){
            return 0;
        }
        int s1=(sum+target)/2;
        int dp[]=new int[s1+1];
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            for(int j=s1;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[s1];
    }
    public static void main(String args[]){
        int nums[]={1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums, target));
    }
}

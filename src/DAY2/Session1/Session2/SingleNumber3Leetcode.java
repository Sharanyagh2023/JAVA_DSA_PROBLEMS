package DAY2.Session1.Session2;

public class SingleNumber3Leetcode {
    public static int[] singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        int rightmostSetBit=ans & -ans;
        int num1=0;
        int num2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & rightmostSetBit)==0){
                num1=num1^nums[i];
            }
            else{
                num2=num2^nums[i];
            }
        }
        return new int[]{num1,num2};
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,2,5};
        int ans[]=singleNumber(nums);
        System.out.println(ans[0]+" "+ans[1]);
    }
}

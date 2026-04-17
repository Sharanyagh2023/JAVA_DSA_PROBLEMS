package DAY2.Session1;

public class ProducrExceptSelf {
    public static int productExceptSelf(int[] nums) {
        int prefix []=new int[nums.length-1];
        int suffix []=new int[nums.length-1];
        for(int i =0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                suffix[i]=suffix[i]*nums[j];
                prefix[j-1]=prefix[j-1]*nums[i];
            }
        }
        for (int i=0;i<nums.length-1;i++){
        prefix[i]=prefix[i]*suffix[i];
        }
        System.err.println(prefix);
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
}

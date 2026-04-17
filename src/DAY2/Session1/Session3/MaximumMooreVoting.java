package DAY2.Session1.Session3;

public class MaximumMooreVoting {
    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(count);
        System.out.println(nums.length/2);
        if((count+1)>(nums.length/2)){
            return candidate;
        }
        else{
            return -1; // no majority element
        }
    }
    public static void main(String[] args) {
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
}

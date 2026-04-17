package DAY2.Session1;

public class SubscriptionRedivalWindow {
    //public static int maxSubArray(int a[], int k){
    //     int left=0;
    //     int right =0;
    //     int m=0;
    //     for(right =0; right<a.length; right++){
    //         while(a[right]-a[left]>k){
    public static void main(String args[]){
        int a[]={1,3,5,7,9};
        int k=4;
        int left=0;
        int right =0;
        int m=0;
        for(right =0; right<a.length; right++){
            while(a[right]-a[left]>k){
                left++;
                //right=left; is not required as we need max window.so, current window size will be previous left-right. when greater, the whole window will move towards right.
            }
            m=Math.max(m,right-left+1);
        }
        System.out.println(m);
    }
}

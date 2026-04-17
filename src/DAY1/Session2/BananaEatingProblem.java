package DAY1.Session2;

public class BananaEatingProblem {
    public static int minEatingSpeed(int[] piles, int H) {
        int left=1;
        int n=piles.length;
        int right=Math.max(piles[0],piles[n-1]);
        int answer=right;
        while(left<=right){
            int mid=(right+left)/2;
            int totalHours=0;
            for(int pile:piles){
                totalHours+=(pile+mid-1)/mid; //ceil of pile/mid  why ic the formula like this?
            }
            if(totalHours<=H){
                answer=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int piles[]={3,6,7,11};
        int H=8;
        int ans=minEatingSpeed(piles, H);
        System.out.println(ans);
    }
    
}

package DAY1.Session2;

public class Denomination {
    public static int countWays(int[] coins, int amount) {
        int num=0;
        int n = coins.length;
        for (int i=0;i<n;i++){
            if (amount/coins[i]>0){
                System.err.println(amount);
                num+=amount/coins[i];
                amount=amount-(num*coins[i]);
                System.out.println(amount);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int coins[]={100,50,20,10,5,2,1};
        int amount=242;
        int ans=countWays(coins, amount);
        System.out.println(ans);
    }
}
//not working
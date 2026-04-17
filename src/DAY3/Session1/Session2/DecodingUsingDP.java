package DAY3.Session1.Session2;

public class DecodingUsingDP {
    public static int numOfWays(String s) {
        if(s.length()==0||s==null){
            return 0;
        }
        int n=s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1; //s.charAt(0)=='0'?0:1;
        for(int i=2;i<=n;i++){
            if(s.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }
            int twoDigit=Integer.parseInt(s.substring(i-2,i));
            if(twoDigit>=10 && twoDigit<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        String s="226";
        System.out.println(numOfWays(s));
    }
}

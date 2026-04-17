package DAY4.Session1;
//longest common subsequence of a string
public class LongestPAlindromeSubsequence {
    public static int longestPalindromeSubsequence(String s){
        String rev =new StringBuilder(s).reverse().toString();
        int n=s.length();
        int dp[][]=new int[n+1][n+1];   //to compare reverse and original
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(longestPalindromeSubsequence(s));
    }
}

package DAY4.Session1;
//use lcs
public class DeleteOperation2String {
    
    //public static int minDistance(String word1, String word2) {
     //   int m=word1.length();
       // int n=word2.length();
        //int dp[][]=new int[m+1][n+1];
        //for(int i=0;i<=m;i++){
        //    dp[i][0]=i;
        //}
        //for(int j=0;j<=n;j++){
         //   dp[0][j]=j;
        //}
       // for(int i=1;i<=m;i++){
        //    for(int j=1;j<=n;j++){
         //       if(word1.charAt(i-1)==word2.charAt(j-1)){
          //          dp[i][j]=dp[i-1][j-1];
           //     }else{
            //       dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+1;
              //  }
           // }
        //}
        //return dp[m][n];
    //}
    public static int minDistance(String s1, String s2){
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];   //to compare reverse and original
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int lcs=dp[m][n];
        return (m+n-(2*lcs));
    }
    public static void main(String[] args) {
        String word1="seam";
        String word2="eat";
        System.out.println(minDistance(word1, word2));
    }
}
//583 leetcode  
//m+n-2*length(lcs) is the formula to find the minimum number of deletions required to make two strings equal.
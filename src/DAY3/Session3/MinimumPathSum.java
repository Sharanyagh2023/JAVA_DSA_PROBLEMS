package DAY3.Session3;

public class MinimumPathSum {
    public static int minPathSum(int [][] grid0){
        int m=grid0.length;
        int n=grid0[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=grid0[0][0];
        for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+grid0[i][0];
        }
        for(int j=1;j<n;j++){
            dp[0][j]=dp[0][j-1]+grid0[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+grid0[i][j];
            }
        }
        return dp[m-1][n-1];

    }
    public static void main(String args[]){
        int[][] Maze={
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        System.out.println(minPathSum(Maze));
    }
}

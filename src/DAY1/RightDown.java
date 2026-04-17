package DAY1;

public class RightDown {
    static int N=4;
    static boolean solve(int [][] route,int x,int y, String path){
        if(x==N-1 && y==N-1){
            System.out.println(path);
            return true;
        }
        if(x<0 || y<0 || x>=N || y>=N || route[x][y]==0){
            return false;
        }
        route[x][y]=0; //visited
        //Down
        if(solve(route, x+1, y, path+"D")){
            return true;
        }
        //Right
        if(solve(route, x, y+1, path)){
            return true;
        }
        route[x][y]=1;
        return true;
    }
    public static void main(String[] args) {
        int [][] route={
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };
        solve(route, 0, 0, "");
    }
    
}

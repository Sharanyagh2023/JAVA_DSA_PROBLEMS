package DAY1;
//climbing stairs leet code
public class ClimbingStairs { //direct, indirect, nested, tree recurssion
    //this is tree recurssion
    static int Climb(int N){
        if(N==0 || N==1){
            return 1;
        }
        return Climb(N-1)+Climb(N-2);
    }
    public static void main(String[] args) {
        int N=5;
        System.out.println(Climb(N));
    }
}

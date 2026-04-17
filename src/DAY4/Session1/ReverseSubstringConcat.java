package DAY4.Session1;

public class ReverseSubstringConcat {
    
    public static void main(String args[]){
        String s="abcde";
        int half=s.length()/2;
        String firstHalf=s.substring(0,half);
        String secondHalf=s.substring(half);
        System.out.println(firstHalf+" "+secondHalf);
        StringBuilder sb1=new StringBuilder(firstHalf);
        sb1.reverse();
        StringBuilder sb2=new StringBuilder(secondHalf);
        sb2.reverse();
        String ans=sb1.toString()+sb2.toString();
        System.out.println(ans);
    }
}

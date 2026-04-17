package DAY2.Session1;
import java.util.*;
public class LongestUniqueSubstringLength {
    public static void main(String args[]){
        Set<Character> set = new HashSet<>();
        String s="pwewkew";
        int left=0;
        int right=0;
        int m=0;
        for(right=0; right<s.length(); right++){
            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            m=Math.max(m,right-left+1);
        }
        System.out.println(m);
    }   
}

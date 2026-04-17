package DAY3.Session1.Session2;

class Trienode{
    Trienode[] chldren;
    boolean isEndOfWord;
    public Trienode(){
        chldren=new Trienode[26];
        isEndOfWord=false;
    }
}
public class LongestPrefix {
    private Trienode root;
    public LongestPrefix(){
        root=new Trienode();
    }
    public void insert(String word){
        Trienode current=root;
        for(char ch: word.toCharArray()){
            int index=ch-'a';
            if(current.chldren[index]==null){
                current.chldren[index]=new Trienode();
            }
            current=current.chldren[index];
        }
        current.isEndOfWord=true;
    }
    public String lcp(String[] str){
        if(str==null || str.length==0){
            return "";
        }
        for(String word: str){
            insert(word);
        }
        StringBuilder sb=new StringBuilder();
        Trienode node=root;
        while(true){
            int count=0;
            int index=-1;
            for(int i=0;i<26;i++){
                if(node.chldren[i]!=null){
                    count++;
                    index=i;
                }
            }
            if(count!=-1 || node.isEndOfWord){
                break;
            }
            sb.append((char) (index+'a'));
            node=node.chldren[index];
        }
        return sb.toString();
    }   
     public static void main(String[] args) {
        LongestPrefix trie=new LongestPrefix();
        String input[]={"flower","flow","flight"};
        System.out.println(input[0]); 
        System.out.println(trie.lcp(input)); // "fl"
    }
}

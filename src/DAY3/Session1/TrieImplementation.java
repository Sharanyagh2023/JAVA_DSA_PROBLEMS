package DAY3.Session1;

class Trienode{
    Trienode[] chldren;
    boolean isEndOfWord;
    public Trienode(){
        chldren=new Trienode[26];
        isEndOfWord=false;
    }
}
public class TrieImplementation {
    private Trienode root;
    public TrieImplementation(){
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
     public boolean search(String word){
        Trienode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=ch-'a';
            if(current.chldren[index]==null){
                return false;
            }
            current=current.chldren[index];
        }
        return current.isEndOfWord;
    }
     public boolean startsWith(String prefix){
        Trienode current=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            int index=ch-'a';
            if(current.chldren[index]==null){
                return false;
            }
            current=current.chldren[index];
        }
        return true;
    }
     public static void main(String[] args) {
         TrieImplementation trie=new TrieImplementation();
         trie.insert("apple");
         trie.insert("hello");
         System.out.println(trie.search("apple")); // true
         System.out.println(trie.search("app")); // true
         System.out.println(trie.search("he")); // false
         System.out.println(trie.startsWith("he")); // true
         System.out.println(trie.startsWith("app")); // true
     }
}
//longest common prefix
//not working 

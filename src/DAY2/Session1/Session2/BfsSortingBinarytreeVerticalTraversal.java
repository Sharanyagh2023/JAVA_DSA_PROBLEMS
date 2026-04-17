package DAY2.Session1.Session2;

class Treenode{
    int val;
    Treenode left,right;
    Treenode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class BfsSortingBinarytreeVerticalTraversal {

    public static void main(String[] args) {
        Treenode root=new Treenode(3);
        root.left=new Treenode(5);
        root.right=new Treenode(20);
        root.right.left=new Treenode(1);
        root.right.right=new Treenode(15);
            
    }
}

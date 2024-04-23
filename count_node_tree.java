public class count_node_tree {
    static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    public static int count(Node root){
    if(root == null){
        return 0;
    }
    int rc = count(root.right);
    int lc = count(root.left);
    int ct = lc+rc+1;
    return ct;
}
public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.left = new Node(5);
    root.right.right = new Node(7);
    root.right.right.right = new Node(6);

    System.out.println(count(root));
}
}


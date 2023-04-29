package home.junseok.question;

class Node {
    public int data;
    public Node lt;
    public Node rt;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTreeTour {

    private Node root;

    public void DFS(Node root) {

        if (root == null ) return;
        DFS(root.lt);
        System.out.println(root.data);
        DFS(root.rt);
    }

    public static void main(String[] args) {

        final BinaryTreeTour tree = new BinaryTreeTour();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }

}

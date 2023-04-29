package home.junseok.question;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelSearch {

    private Node root;

    public static class Node {
        int data;
        Node lt;
        Node rt;
        public Node(int data) {
            this.data = data;
        }
    }

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while(!queue.isEmpty()) {
            System.out.print(level++ + " : ");
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Node node = queue.poll();
                System.out.print(node.data);
                if (node.lt != null) queue.offer(node.lt);
                if (node.rt != null) queue.offer(node.rt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final BinaryTreeLevelSearch tree = new BinaryTreeLevelSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}

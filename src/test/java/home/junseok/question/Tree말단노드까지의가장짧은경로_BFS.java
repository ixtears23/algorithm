package home.junseok.question;

import java.util.LinkedList;
import java.util.Queue;

public class Tree말단노드까지의가장짧은경로_BFS {

    Node root;

    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while(!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                final Node currentNode = queue.poll();
                if (currentNode.lt == null && currentNode.rt == null) return i;
                if (currentNode.lt != null) queue.offer(currentNode.lt);
                if (currentNode.rt != null) queue.offer(currentNode.rt);
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {

        final Tree말단노드까지의가장짧은경로_BFS tree = new Tree말단노드까지의가장짧은경로_BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(BFS(tree.root));
    }
}

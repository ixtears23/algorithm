package home.junseok.question;

public class Tree말단노드까지의가장짧은경로_DFS {
    Node root;
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int DFS(int level, Node root) {
        if (root.lt == null && root.rt == null) return level;
        return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
    }

    public static void main(String[] args) {

        final Tree말단노드까지의가장짧은경로_DFS tree = new Tree말단노드까지의가장짧은경로_DFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(DFS(0, tree.root));
    }
}

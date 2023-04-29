package home.junseok.programmers;

class Node {
    String data;
    Node left;
    Node right;
    public Node(String data) {
        this.data = data;
    }
}

public class Solution {

    private Node node;

    public static void main(String[] args) {
        System.out.println(Math.sqrt(15));;
    }

    public String solution(String message) {
        final String[] messages = message.split("");
        Math.pow(2, message.length());

        final Solution tree = new Solution();
        tree.node = createTree(messages);
        return "";
    }

    private Node createTree(String[] messages) {
        return null;
    }

    public Node createNode(String s) {

        final Node node = new Node("");

        return null;
    }

}

public class Node {

    private int val;
    private Node left;
    private Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public int getter() {
        int value = val;
        return value;
    }
    public void setterLeft(Node node) {
        this.left = node;
    }
    public void setterRight(Node node) {
        this.right = node;
    }
}

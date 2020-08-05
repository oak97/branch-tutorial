package search.strategy;

public class Branch {
    public Instance inst;
    public Node left_node;
    public Node right_node;

    public Branch(Instance inst) {
        this.inst = inst;
    }

    //naive
    public boolean branch(Node node) {
        if (node.id == 0) {
            left_node = inst.nodes[1].copy();
            right_node = inst.nodes[2].copy();
            return true;
        } else if (node.id == 1) {
            left_node = inst.nodes[3].copy();
            right_node = inst.nodes[4].copy();
            return true;
        } else {
            return false;
        }
    }
}

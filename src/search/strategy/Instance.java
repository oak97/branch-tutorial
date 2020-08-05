package search.strategy;

import java.util.Arrays;

public class Instance {
    public int height;
    public int size;
    public Node[] nodes;

    //naive
    public Instance() {
        height = 3;
        size = 5;
        nodes = new Node[size];
        nodes[0] = new Node(0, 11.6, 7.2, 153.2);
        nodes[1] = new Node(1, 11, 7.5, 152);
        nodes[2] = new Node(2, 12, 6, 144);
        nodes[3] = new Node(3, 10, 8, 150);
        nodes[4] = new Node(4, 11, 7, 147);
    }


    @Override
    public String toString() {
        return "Instance{" +
                "n=" + height +
                ", m=" + size +
                ", nodes=" + Arrays.toString(nodes) +
                '}';
    }
}

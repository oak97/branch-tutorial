package search.strategy;

public class Node implements Comparable {
    public int id;
    public double x1;
    public double x2;
    public double z;

    public boolean ip_feasible;

    public Node() {
    }

    public Node(int id, double x1, double x2, double z) {
        this.id = id;
        this.x1 = x1;
        this.x2 = x2;
        this.z = z;
        this.ip_feasible = (x1 - (int) x1 < 0.001) && (x2 - (int) x2 < 0.001);
    }

    public Node(Instance inst) {

    }

    public Node copy() {
        return new Node(this.id, this.x1, this.x2, this.z);
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", z=" + z +
                ", ip_feasible=" + ip_feasible +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Node node = (Node) o;
        if (z < node.z)
            return -1;
        else if (z == node.z)
            return 0;
        else
            return 1;
    }
}

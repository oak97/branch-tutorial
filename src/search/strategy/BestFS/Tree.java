package search.strategy.BestFS;

import search.strategy.Branch;
import search.strategy.Instance;
import search.strategy.Node;

import java.util.PriorityQueue;

public class Tree {
    public PriorityQueue<Node> queue;
    public Instance inst;

    double best_x1;
    double best_x2;
    double best_z;

    //初始化树
    public Tree(Instance inst, int init_sol_v) {
        this.inst = inst;
        //初始化界，用启发式得到的初始解
        best_z = init_sol_v;
        //根节点
        Node node = inst.nodes[0];
        //优先队列
        queue = new PriorityQueue<Node>();
        queue.add(node);
    }

    public int[] solve() {
        int branch_cnt = 0;
        int prune_cnt = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("* " + node);
            assert node != null;
            //剪枝（不用分支）：利用界
            if (node.z < best_z - 0.0001) {
                System.out.println("剪枝：利用界为" + best_z + "，" + node.z + " < " + best_z);
                branch_cnt++;
                continue;
            }
            //剪枝（不用分支）：更新best
            if (node.ip_feasible && node.z - 0.0001 > best_z) {
                System.out.print("剪枝：更新best，从" + best_z + "变为");
                branch_cnt++;
                best_z = node.z;
                best_x1 = node.x1;
                best_x2 = node.x2;
                System.out.println(best_z);
                continue;
            }
            //需要分支
            Branch bc = new Branch(inst);
            if (bc.branch(node)) {
                System.out.println("分支：左右节点分别为 " + bc.left_node + "，" + bc.right_node);
                prune_cnt++;
                queue.add(bc.left_node);
                queue.add(bc.right_node);
            } else {
                System.out.println("无法分支");
            }
        }
        return new int[]{branch_cnt, prune_cnt};

    }
}

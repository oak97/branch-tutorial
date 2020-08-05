package search.strategy.BFS;

import search.strategy.Instance;

public class Run {
    public static void main(String[] args) {
        Instance inst = new Instance();
        Tree tree = new Tree(inst, 120);//sum of mins of every level
        System.out.println(inst);
        int[] cnt = tree.solve();
        System.out.println("----- BFS 汇报结果 -----");
        System.out.println("分支次数为" + cnt[0] + "，剪枝次数为" + cnt[1]);
        System.out.println("max value = " + tree.best_z);
    }
}
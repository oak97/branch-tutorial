## Part1 Branch
- 树结构的分支
- 决策树中的分支要素
- balltree代码



## Part2 Bound

- 为什么要加入bound：剪枝
- lb和ub



## Part3 (M)IP

- LP-based B&B：LP作为IP的下界
- 松弛后的LP恰是原IP的下界
  - 不用像前面最短路问题尝试各种heuristic function
  - 也不用不同问题手工定制

- 松弛后的LP无可行解：剪枝
- LP的可行解如果也是IP可行：更新上界，剪枝（不用继续分支）



## Part4 VRP

- 车辆流模型下的单纯B&B
- 集合覆盖模型下的B&P&C的Branch部分
  - 用列生成求解LP
    - 定价子问题求解
    - Cut



## Part5 Take-Away

- branch
- bound
- LP-based B&B
- VRP：VRPTW单纯B&B => 论文的B&P&C
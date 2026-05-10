# Graph Traversal System (BFS & DFS)

## Project Overview
This project implements a graph using adjacency list representation.  
A graph consists of vertices (nodes) and edges (connections between nodes).  

We implemented two main traversal algorithms:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

---

## Classes

### Vertex
Represents a node in the graph with a unique id.

### Edge
Represents a connection between two vertices (source → destination).

### Graph
Stores the graph using an adjacency list (Map<Integer, List<Integer>>).  
Handles adding vertices, edges, and running BFS/DFS.

### Experiment
Runs tests on graphs of different sizes and measures execution time.

---

## Algorithms

### BFS (Breadth-First Search)
- Uses a queue
- Visits neighbors level by level
- Good for shortest path in unweighted graphs

Time complexity: O(V + E)

### DFS (Depth-First Search)
- Uses recursion
- Goes deep into one path before backtracking
- Useful for exploring all paths

Time complexity: O(V + E)

---

## Experimental Results

| Graph Size | BFS Time | DFS Time |
|------------|----------|----------|
| 10         | ... ns   | ... ns   |
| 30         | ... ns   | ... ns   |
| 100        | ... ns   | ... ns   |

---

## Observations

- Larger graphs take more time to traverse
- BFS and DFS have similar complexity O(V + E)
- DFS is sometimes faster due to recursion overhead differences
- Graph structure affects traversal order significantly

---

## BFS vs DFS

- BFS is better for shortest path problems
- DFS is better for deep exploration

---

## Challenges
- Understanding recursion in DFS
- Managing visited nodes properly
- Measuring execution time correctly

---

## Conclusion
This project helped understand how graph traversal works and how algorithm performance changes with graph size.

import java.util.Random;

public class Experiment {

    public void runTraversals(Graph g) {
        System.out.println("BFS:");
        g.bfs(0);

        System.out.println("DFS:");
        g.dfs(0);
    }

    public void runMultipleTests() {
        System.out.println("=== SMALL GRAPH ===");
        testGraph(10);

        System.out.println("\n=== MEDIUM GRAPH ===");
        testGraph(30);

        System.out.println("\n=== LARGE GRAPH ===");
        testGraph(100);
    }

    private void testGraph(int size) {
        Graph g = new Graph();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }

        // random edges
        for (int i = 0; i < size * 2; i++) {
            int from = rand.nextInt(size);
            int to = rand.nextInt(size);
            g.addEdge(from, to);
        }

        long startBFS = System.nanoTime();
        g.bfs(0);
        long endBFS = System.nanoTime();

        long startDFS = System.nanoTime();
        g.dfs(0);
        long endDFS = System.nanoTime();

        System.out.println("BFS time: " + (endBFS - startBFS));
        System.out.println("DFS time: " + (endDFS - startDFS));
    }

    public void printResults() {
        System.out.println("Experiments completed.");
    }
}
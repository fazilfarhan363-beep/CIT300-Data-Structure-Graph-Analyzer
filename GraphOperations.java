import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** Undirected graph represented with an adjacency list. */
public class GraphOperations {
    private final Map<String, Set<String>> adjacency = new LinkedHashMap<>();

    public void addVertex(String vertex) {
        if (vertex == null || vertex.trim().isEmpty()) {
            System.out.println("Vertex name cannot be empty.");
            return;
        }
        vertex = vertex.trim();
        if (adjacency.containsKey(vertex)) {
            System.out.println("Vertex already exists.");
            return;
        }
        adjacency.put(vertex, new LinkedHashSet<>());
        System.out.println("Vertex added: " + vertex);
    }

    public void addEdge(String from, String to) {
        from = from == null ? "" : from.trim();
        to = to == null ? "" : to.trim();
        if (!adjacency.containsKey(from) || !adjacency.containsKey(to)) {
            System.out.println("Both vertices must exist before adding an edge.");
            return;
        }
        adjacency.get(from).add(to);
        adjacency.get(to).add(from);
        System.out.println("Edge added: " + from + " -- " + to);
    }

    public void display() {
        if (adjacency.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        for (Map.Entry<String, Set<String>> entry : adjacency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public List<String> bfs(String start) {
        List<String> order = new ArrayList<>();
        if (!adjacency.containsKey(start)) {
            System.out.println("Start vertex not found.");
            return order;
        }
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new ArrayDeque<>();
        visited.add(start);
        queue.offer(start);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            order.add(current);
            for (String neighbour : adjacency.get(current)) {
                if (visited.add(neighbour)) queue.offer(neighbour);
            }
        }
        System.out.println("BFS traversal: " + order);
        System.out.println("Visited vertices: " + order.size());
        return order;
    }

    public List<String> dfs(String start) {
        List<String> order = new ArrayList<>();
        if (!adjacency.containsKey(start)) {
            System.out.println("Start vertex not found.");
            return order;
        }
        Set<String> visited = new LinkedHashSet<>();
        dfsRecursive(start, visited, order);
        System.out.println("DFS traversal: " + order);
        System.out.println("Visited vertices: " + order.size());
        return order;
    }

    private void dfsRecursive(String vertex, Set<String> visited, List<String> order) {
        visited.add(vertex);
        order.add(vertex);
        for (String neighbour : adjacency.get(vertex)) {
            if (!visited.contains(neighbour)) dfsRecursive(neighbour, visited, order);
        }
    }

    public int vertexCount() {
        return adjacency.size();
    }

    public int edgeCount() {
        int total = 0;
        for (Set<String> neighbours : adjacency.values()) total += neighbours.size();
        return total / 2;
    }
}

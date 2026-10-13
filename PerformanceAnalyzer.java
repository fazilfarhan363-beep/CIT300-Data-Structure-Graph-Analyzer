public class PerformanceAnalyzer {
    public static void showSearchComparison(int[] values, int target) {
        if (values.length == 0) {
            System.out.println("Array is empty. Add values first.");
            return;
        }
        System.out.println("\n========== SEARCH PERFORMANCE ==========");
        SearchingAlgorithms.compare(values, target);
        System.out.println("========================================");
    }

    public static void showComplexityNotes() {
        System.out.println("\n========== COMPLEXITY GUIDE ==========");
        System.out.println("Array search: O(n)");
        System.out.println("Array insert at end (available capacity): O(1)");
        System.out.println("Array delete by value: O(n)");
        System.out.println("Stack push/pop: O(1) amortized");
        System.out.println("Queue enqueue/dequeue: O(1) amortized");
        System.out.println("Linked List search: O(n)");
        System.out.println("Binary Search: O(log n), requires sorted data");
        System.out.println("BFS/DFS with adjacency lists: O(V + E)");
        System.out.println("V = vertices; E = edges.");
        System.out.println("Execution time in nanoseconds can vary by computer and JVM.");
        System.out.println("======================================");
    }
}

import java.util.Arrays;

/** Linear and binary search with comparison/step counts. */
public class SearchingAlgorithms {
    public static SearchResult linearSearch(int[] values, int target) {
        long start = System.nanoTime();
        int steps = 0;
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            steps++;
            if (values[i] == target) {
                index = i;
                break;
            }
        }
        long elapsed = System.nanoTime() - start;
        return new SearchResult("Linear Search", index, steps, elapsed);
    }

    /** Binary search expects sorted input. */
    public static SearchResult binarySearch(int[] sortedValues, int target) {
        long start = System.nanoTime();
        int low = 0, high = sortedValues.length - 1;
        int steps = 0, index = -1;
        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;
            if (sortedValues[mid] == target) {
                index = mid;
                break;
            } else if (sortedValues[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        long elapsed = System.nanoTime() - start;
        return new SearchResult("Binary Search", index, steps, elapsed);
    }

    public static void compare(int[] values, int target) {
        int[] sorted = Arrays.copyOf(values, values.length);
        Arrays.sort(sorted);
        SearchResult linear = linearSearch(values, target);
        SearchResult binary = binarySearch(sorted, target);

        System.out.println("\nSearch performance for target " + target);
        printResult(linear);
        printResult(binary);
        System.out.println("Note: Binary Search uses a sorted copy. Sorting cost is not included in its search time.");
        System.out.println("Linear Search average/worst time: O(n). Binary Search time: O(log n) on sorted data.");
    }

    private static void printResult(SearchResult result) {
        System.out.printf("%s: %s, steps=%d, elapsed=%d ns%n",
                result.algorithm,
                result.index >= 0 ? "found (index " + result.index + ")" : "not found",
                result.steps, result.elapsedNanos);
    }

    public static class SearchResult {
        public final String algorithm;
        public final int index;
        public final int steps;
        public final long elapsedNanos;

        SearchResult(String algorithm, int index, int steps, long elapsedNanos) {
            this.algorithm = algorithm;
            this.index = index;
            this.steps = steps;
            this.elapsedNanos = elapsedNanos;
        }
    }
}

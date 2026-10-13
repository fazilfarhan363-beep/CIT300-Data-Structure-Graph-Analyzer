import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayOperations array = new ArrayOperations();
    private static final StackOperations stack = new StackOperations();
    private static final QueueOperations queue = new QueueOperations();
    private static final LinkedListOperations linkedList = new LinkedListOperations();
    private static final GraphOperations graph = new GraphOperations();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> linkedListMenu();
                case 5 -> searchMenu();
                case 6 -> graphMenu();
                case 7 -> PerformanceAnalyzer.showComplexityNotes();
                case 8 -> displayAll();
                case 9 -> running = false;
                default -> System.out.println("Invalid choice. Enter a number from 1 to 9.");
            }
        }
        System.out.println("Thank you for using Data Structure & Graph Analyzer.");
        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("\n======================================");
        System.out.println("   DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("======================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance / Complexity Guide");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
    }

    private static void arrayMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert  2. Delete  3. Search  4. Display  5. Back");
            switch (readInt("Choice: ")) {
                case 1:
                    array.insert(readInt("Value: "));
                    break;
                case 2:
                    System.out.println(array.delete(readInt("Value to delete: ")) ? "Deleted." : "Value not found.");
                    break;
                case 3: {
                    int index = array.search(readInt("Value to search: "));
                    System.out.println(index >= 0 ? "Found at index " + index : "Not found.");
                    break;
                }
                case 4: array.display(); break;
                case 5: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void stackMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push  2. Pop  3. Peek  4. Display  5. Back");
            switch (readInt("Choice: ")) {
                case 1: stack.push(readInt("Value: ")); break;
                case 2: stack.pop(); break;
                case 3: {
                    Integer value = stack.peek();
                    if (value != null) System.out.println("Top value: " + value);
                    break;
                }
                case 4: stack.display(); break;
                case 5: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void queueMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue  2. Dequeue  3. Front  4. Display  5. Back");
            switch (readInt("Choice: ")) {
                case 1: queue.enqueue(readInt("Value: ")); break;
                case 2: queue.dequeue(); break;
                case 3: {
                    Integer value = queue.front();
                    if (value != null) System.out.println("Front value: " + value);
                    break;
                }
                case 4: queue.display(); break;
                case 5: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void linkedListMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert  2. Delete  3. Search  4. Display  5. Back");
            switch (readInt("Choice: ")) {
                case 1: linkedList.insert(readInt("Value: ")); break;
                case 2:
                    System.out.println(linkedList.delete(readInt("Value to delete: ")) ? "Deleted." : "Value not found.");
                    break;
                case 3:
                    System.out.println(linkedList.search(readInt("Value to search: ")) ? "Found." : "Not found.");
                    break;
                case 4: linkedList.display(); break;
                case 5: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void searchMenu() {
        if (array.size() == 0) {
            System.out.println("Insert values into the array first.");
            return;
        }
        int target = readInt("Value to search for: ");
        PerformanceAnalyzer.showSearchComparison(array.getValues(), target);
    }

    private static void graphMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- GRAPH OPERATIONS (UNDIRECTED) ---");
            System.out.println("1. Add Vertex  2. Add Edge  3. Display");
            System.out.println("4. BFS Traversal  5. DFS Traversal  6. Back");
            switch (readInt("Choice: ")) {
                case 1: graph.addVertex(readText("Vertex name: ")); break;
                case 2:
                    String from = readText("From vertex: ");
                    String to = readText("To vertex: ");
                    graph.addEdge(from, to);
                    break;
                case 3: graph.display(); break;
                case 4: graph.bfs(readText("Start vertex: ")); break;
                case 5: graph.dfs(readText("Start vertex: ")); break;
                case 6: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void displayAll() {
        System.out.println("\n--- ARRAY ---"); array.display();
        System.out.println("--- STACK ---"); stack.display();
        System.out.println("--- QUEUE ---"); queue.display();
        System.out.println("--- LINKED LIST ---"); linkedList.display();
        System.out.println("--- GRAPH ---"); graph.display();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}

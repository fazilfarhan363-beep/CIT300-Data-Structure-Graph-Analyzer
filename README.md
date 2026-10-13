# Data Structure & Graph Performance Analyzer

## Project Description

This Java console application demonstrates fundamental data structures, searching algorithms, graph traversal, and basic performance/complexity analysis. A single integrated menu lets the user work with arrays, stacks, queues, linked lists, and an undirected graph, compare linear versus binary search, and view a time-complexity reference guide.

## Technologies Used

- Java (JDK 17 or later)
- Visual Studio Code (or any Java IDE / terminal)
- Git and GitHub for version control and collaboration

## Team Members, Student IDs, and Contributions

Each member implemented their assigned data structure on a dedicated GitHub branch, which was then merged into the shared project.

| Member | Name | Index Number | Assigned responsibility | Individual contribution | Branch |
|---|---|---|---|---|---|
| 1 | Fazil Farhan (`fazilfarhan363-beep`) | 23DA2-0772 | Repository setup, main menu, array operations, searching algorithms | Set up the GitHub repository and branches. Wrote `Main.java` (integrated menu with input validation and display-all), `ArrayOperations.java` (fixed-capacity array: insert, delete, search, display), and `SearchingAlgorithms.java` (linear and binary search with step counts and nanosecond timing) | `feature/member-1` |
| 2 | Amjath (`amjathamjath`) | 23DA2-1038 | Stack and queue implementations | Wrote `StackOperations.java` (dynamic-list LIFO: push, pop, peek, display with empty-stack handling) and `QueueOperations.java` (ArrayDeque FIFO: enqueue, dequeue, front, display with empty-queue handling) | `feature/member-2` |
| 3 | Hiyas (`hiyas-23`) | 23DA2-0795 | Linked list implementation | Wrote `LinkedListOperations.java` (singly linked list with a private `Node` type: tail-append insert, value delete, linear search, arrow-style display) | `feature/member-3` |
| 4 | Peros (`feroz-khan`) | 23DA2-0844 | Graph operations and performance analysis | Wrote `GraphOperations.java` (undirected adjacency-list graph: add vertex/edge, display, BFS, DFS, vertex/edge counts) and `PerformanceAnalyzer.java` (search comparison output and complexity reference guide) | `feature/member-4` |

All members participate in integration, testing, documentation, and the merged demonstration video.

## Main System Features

- **Array:** insert, delete, search, display (fixed capacity, with a full-array guard)
- **Stack:** push, pop, peek, display; handles an empty stack
- **Queue:** enqueue, dequeue, front, display; handles an empty queue
- **Linked List:** insert, delete, search, display
- **Searching:** linear search and binary search; reports step counts and elapsed nanoseconds side by side
- **Graph:** undirected adjacency-list graph; add vertex, add edge, display, BFS traversal, DFS traversal
- **Performance:** search comparison and an asymptotic-complexity guide
- **Integrated menu:** input validation for non-numeric entry and a display-all overview

### Project Files

| File | Purpose |
|---|---|
| `Main.java` | Main menu and program integration |
| `ArrayOperations.java` | Fixed-capacity array operations |
| `StackOperations.java` | Stack (LIFO) operations |
| `QueueOperations.java` | Queue (FIFO) operations |
| `LinkedListOperations.java` | Singly linked list operations |
| `SearchingAlgorithms.java` | Linear and binary search with step/time results |
| `GraphOperations.java` | Graph vertex/edge operations and BFS/DFS |
| `PerformanceAnalyzer.java` | Performance output and complexity notes |

## How to Run the Program

Requirements: JDK 17 or later. Confirm both commands work in your terminal:

```powershell
java -version
javac -version
```

Open a terminal in the project folder and run:

```powershell
javac *.java
java Main
```

The menu then offers: 1. Array, 2. Stack, 3. Queue, 4. Linked List, 5. Searching, 6. Graph, 7. Performance/Complexity Guide, 8. Display All, 9. Exit. For the searching option, insert array values first.

## Complexity Summary

| Operation / Algorithm | Typical time complexity |
|---|---|
| Array search | O(n) |
| Array delete by value | O(n) |
| Stack push/pop | O(1) amortized |
| Queue enqueue/dequeue | O(1) amortized |
| Linked list search | O(n) |
| Linear search | O(n) |
| Binary search on sorted data | O(log n) |
| BFS with adjacency list | O(V + E) |
| DFS with adjacency list | O(V + E) |

`V` means vertices and `E` means edges. Measured elapsed time varies with the computer, JVM, and runtime conditions. Binary search here runs on a sorted copy; the sorting time is not included in the displayed search timing.

## GitHub Collaboration Workflow

1. Each member creates and works on their own branch (`feature/member-N`).
2. Commit meaningful, tested changes under their own name.
3. Push the branch to GitHub.
4. Open a pull request to the shared branch.
5. Review, test, and merge.

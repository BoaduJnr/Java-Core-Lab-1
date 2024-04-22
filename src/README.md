
---

# Java Core Intermediate Level Upskilling - Lab Exercises

Welcome to the Java Core Intermediate Level Upskilling Labs. Below are the completed exercises for the lab exercises organized by topic and week.

## Week 1 – Java Core Lab #1: March 04th-08th, 2024

### Topic Scope
- **Advanced Java Features** (Object-Oriented Programming concepts, Generics, Collections Framework)
- **Exception Handling**
- **Java Concurrency** (Multithreading)
- **Advanced Data Structures** (e.g., Trees, Graphs)
- **Advanced Algorithms** (e.g., Greedy Algorithms, Dynamic Programming)

### Lab Exercises Overview

#### **Advanced Java Features**
1. **Implement a Design Pattern**
    - **Factory**: 
        - Designed Taxi Request App that Implement a factory Design Pattern to create appropriate order based on request type.
   
    - **Prototype**:
        - Designed Movie streaming App that the clones Movie Series when add to a watchlist.
   
   - **Singleton**:
       - Imitated Dependency Injection by creating A Singleton and making it available for who ever requests it.


2. **Leverage Inner Classes for Data Encapsulation**
    - **Library and Books**: Created a class with an inner class to allow grouping of books based fiction type.
  

#### **Generics in Depth**
3. **Create a Generic Method for Data Validation**
    - **Data Validation**: Implemented a generic method that validates different data types based on specific criteria.
n.

4. **Design a Generic Class for Stack Data Structure**
    - **Stack Data Structure**: Developed a generic Stack class.


#### **Collections Framework Advanced Usage**
5. **Implement a Thread-Safe Cache using ConcurrentHashMap**
    - **Objective**: Design a simple in-memory cache.
    - **Tasks**:
        - Use `ConcurrentHashMap` to ensure thread safety.
        - Demonstrate storing and retrieving key-value pairs from the cache.

6. **Process a Collection using Stream API and Custom Comparator**
    - **Stream API and Custom Comparator**: Utilized the Stream API and a custom comparator to process collections.

#### **Exception Handling**
7. **Handling Checked and Unchecked Exceptions**
    - **Handled Checked and Unchecked Exceptions**:
        - Created methods that throw both types of exceptions with reading from  file and math division.
        - Implemented appropriate try-catch blocks for handling excepton when reading from file and dividing by zero.

8. **Utilizing Nested Try-Catch Blocks**
    - **Utilizing Nested Try-Catch Blocks**:
        - Simulated a complex scenario that could throw multiple types of exceptions with scanning for data and reading from file.
        - Handle exceptions at different levels using nested blocks.

9. **Releasing Resources with finally Block**
    - **Releasing Resources with finally Block**:
        - Opened a file and handled potential IOExceptions.
        - Ensured the file is closed using a finally block, regardless of exceptions.

10. **Creating a Custom Exception**
    - ** Custom Exception**:
        - Created insufficient funds exception in bank withdrawal process.
        - Created and used a custom exception class.

#### **Concurrency (Multithreading)**
11. **Implement a Thread Pool for Image Processing**
    - **Image Processing**:
        - Utilized `ExecutorService` to manage a pool of threads.
        - Created tasks for processing each image and execute them using the thread pool.

12. **Leverage ConcurrentHashMap for Thread-Safe Caching**N/A
    - **Objective**: Implement a thread-safe caching mechanism.
    - **Tasks**:
        - Use `ConcurrentHashMap` to store and manage cache data safely across multiple threads.

13. **Synchronized Block for Updating a Shared Counter**
    - **Updating a Shared Counter**:
        - Created a method to increment a counter and wrap the critical section with a synchronized block.

14. **Deadlock Example and Prevention**
    - **Deadlock simulation**:
        - Simulated deadlock by making two threads try to access each other's locked resource.
        - Resolved deadlock by making both threads queue to process resources in same order.


#### **Advanced Data Structures (Trees & Graphs)**N/A
15. **Exercise 1: Implement a Balanced Binary Search Tree (AVL Tree)**N/A

Objective: Design and implement an AVL Tree with insertion, deletion, and search functionalities.
Description: Ensure the tree remains balanced through rotations and demonstrate efficient search and insertion operations.

16. **Exercise 2: Utilize a Heap for Task Scheduling**N/A

Objective: Implement a Min Heap to manage and execute tasks based on their priorities.
Description: Design a priority queue using a Min Heap to schedule tasks efficiently.

17. **Exercise 3: Build a Trie for Autocomplete Functionality**N/A

Objective: Develop a Trie data structure for efficient prefix-based search.
Description: Store a set of words in the Trie and implement search functionalities to support autocomplete features.

18. **Exercise 4: Implement Depth-First Search (DFS) on a Graph**
     - **Depth-First Search (DFS) on a Graph**:
       - Used DFS to explore all nodes in a graph thoroughly.

19. **Exercise 5: Find the Shortest Path with Dijkstra's Algorithm**
    - **Dijkstra's Algorithm**:
        -  Implemented Dijkstra's algorithm to find the shortest path between nodes in a weighted graph.

20. **Exercise 6: Calculate Minimum Spanning Tree with Prim's Algorithm**N/A
    - **Prim's Algorithm**:
        - Use Prim's algorithm to find a minimum spanning tree that connects all nodes with minimal costs.

___
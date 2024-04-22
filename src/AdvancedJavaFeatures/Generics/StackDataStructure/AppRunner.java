package AdvancedJavaFeatures.Generics.StackDataStructure;

public class AppRunner {
        public static void main(String[] args) {

            //Strings Stack Data Structure
            StackDataStructure<String> stringStack = new StackDataStructure<>();
            stringStack.push("Hello");
            stringStack.push("World");
            System.out.println("Top element: " + stringStack.peek());  // Outputs "World"
            System.out.println("Stack size: " + stringStack.size());   // Outputs 2
            System.out.println("Popped element: " + stringStack.pop()); // Outputs "World"
            System.out.println("New top element: " + stringStack.peek());// Outputs "Hello"

            //Integer Stack DataStructure
            StackDataStructure<Integer> integerStack = new StackDataStructure<>();
            integerStack.push(45);
            integerStack.push(89);
            integerStack.push(0);
            System.out.println("Top element: " + integerStack.peek());  // Outputs "0"
            System.out.println("Stack size: " + integerStack.size());   // Outputs 3
            System.out.println("Popped element: " + integerStack.pop()); // Outputs "0"
            System.out.println("New top element: " + integerStack.peek());// Outputs "89"

        }
    }



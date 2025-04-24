import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");

        // Print all elements
        System.out.println("Fruits: " + fruits);

        // Access an element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits);
    }
}

package Arryas;

import java.util.ArrayList;

public class UpdateArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Display the ArrayList before the update
        System.out.println("ArrayList before update: " + list);

        // Update the element at a specific index (e.g., index 2)
        int indexToUpdate = 2;
        String newValue = "Grape";
        list.set(indexToUpdate, newValue);

        // Display the ArrayList after the update
        System.out.println("ArrayList after update: " + list);
    }
}


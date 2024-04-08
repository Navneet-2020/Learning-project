package seleniumprograms;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Create a list of strings
        List<String> stringList = new ArrayList<>();

        // Add elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        stringList.add("Pears");
        stringList.add("Watermelon");
        stringList.add("Plum");
        stringList.add("Mango");
        
        // Print the elements of the list
        System.out.println("Elements of the list:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Get the size of the list
        int size = stringList.size();
        System.out.println("Size of the list: " + size);

        // Check if the list contains a specific element
        boolean containsBanana = stringList.contains("Banana");
        System.out.println("List contains Banana: " + containsBanana);

        // Get the element at a specific index
        String elementAtIndex2 = stringList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);
        
        String elementAtIndex0 = stringList.get(0);
        System.out.println("Element at index 0: " + elementAtIndex0);
              
        
       
        // Remove an element from the list
        boolean removed = stringList.remove("Orange");
        System.out.println("Element Orange removed: " + removed);
        
        stringList.remove(5);
        System.out.println(stringList);
        System.out.println(stringList.get(5));

        stringList.set(2,"strawberry");
        System.out.println(stringList);
        System.out.println(stringList.get(5));
        
        
        // Print the updated list
        System.out.println("Updated list:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
        
        //create another list
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Blueberry");
        stringList2.add("Peach");
        stringList2.add("Blackberry");
        
        //add list2 into list 1
        stringList.addAll(stringList2);
        System.out.println(stringList);
        
        // Clear the list
        stringList.clear();
        System.out.println("List cleared. Size of the list: " + stringList.size());
    }

	}



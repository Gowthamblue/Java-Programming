import java.util.*;
public class HashTree {
    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(45);
        treeset.add(61);
        treeset.add(7);
        treeset.add(56);
        treeset.add(18);
        System.out.println("Original Tree "+treeset);
        System.out.println("First element:"+treeset.first());
        System.out.println("Last element:"+treeset.last());
        System.out.println("ceiling of 16: "+treeset.ceiling(16));
        System.out.println("Floor of 16: "+treeset.floor(16));
        System.out.println("Higher than 15: "+treeset.higher(15));
        System.out.println("Lower than 15:"+treeset.lower(15));
        System.out.println("HeadSet(less than 15): "+treeset.headSet(15));
        System.out.println("TailSet(greater than or equal 15): "+treeset.tailSet(15));
        System.out.println("SubSet : "+treeset.subSet(10,30));

        
        System.out.println("PollFirst (removes first): "+treeset.pollFirst());
        System.out.println("Treeset after pollFirst: "+treeset);
        System.out.println("PollLast (removes last): "+treeset.pollLast());
        System.out.println("Treeset after lastFirst: "+treeset);

        // General Methods
        System.out.println("The size of the Tree "+treeset.size());
        System.out.println("Is the Set contains: "+(treeset.contains(45)));
        System.out.println("Is the Tree is Empty "+(treeset.isEmpty()));

        // Add all elements from another collection
        List<Integer> additionalElements = Arrays.asList(25, 35, 40);
        treeset.addAll(Arrays.asList(24,25,28));
        System.out.println("TreeSet after adding collection: " + treeset); // Output: [10, 15, 20, 25, 35, 40]

        // Iteration
        System.out.println("Iterating over TreeSet:");
        for (Integer element : treeset) {
            System.out.print(element + " "); // Output: 10 15 20 25 35 40
        }
        System.out.println();

        // Convert to Array
        Object[] array = treeset.toArray();
        System.out.println("Array from TreeSet: " + Arrays.toString(array)); // Output: [10, 15, 20, 25, 35, 40]

        // Clear TreeSet
        treeset.clear();
        System.out.println("TreeSet after clearing: " + treeset); // Output: []





        
    }
}

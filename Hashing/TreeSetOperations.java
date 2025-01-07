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





        
    }
}

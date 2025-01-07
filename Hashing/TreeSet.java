import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<Integer>();   
        set.add(61);
        set.add(15);
        set.add(4);
        set.add(53);
        System.out.println("Original Set : "+ set);
        System.out.println("The first Element: "+set.first());
        System.out.println("The Last Element: "+set.last());
        SortedSet<Integer> head = set.headSet(15);
        System.out.println("The Element (Less than 15): "+head);
        SortedSet<Integer> tail = set.tailSet(15);
        System.out.println("The Element (Greater than 15): "+tail);
        SortedSet<Integer> subset = set.subSet(10, 50);
        System.out.println("The subset (10 to 50): "+subset);
}
}

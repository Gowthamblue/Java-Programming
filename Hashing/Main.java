import java.util.*;
public class Main{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5757);
        set.add(3);
        set.add(7);
        System.out.println("The first set is "+set);
        Set<Integer> set2 = new HashSet<>();
        set2.add(332);
        set2.add(54);
        set2.add(3);
        set2.add(61);
        System.out.println("The second set is "+set2);
        set.addAll(set2);
        System.out.println("The adding of two sets: "+set);
        Iterator iterator = set.iterator();
        System.out.println("Using iterator");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        set.remove(3);
        System.out.println("Set after removing: "+set);
        set.removeAll(set2);
        System.out.println("Set after Remove ALL: "+set);
        set.add(61);
        set.retainAll(set2);
        System.out.println("Set After retaining All set2: "+set);
        set.clear();
        System.out.println("Set after clearing "+set);
        set.add(5757);
        set.add(3);
        set.add(7);
        set.add(61);
        set.add(332);
        set.add(54);
        System.out.println("The size of the set is: "+set.size());
        Object[] arr = set.toArray();
        System.out.println("The set after converting to Array:" );
        for(Object ob:arr)
        {
            System.out.print(ob+" ");
        }
        System.out.println("Is the set Contains the Given Element: "+(set.contains(61)));
        System.out.println("Is the set Contains All the Elements from the Set2 : "+(set.containsAll(set2)));
        





    }

}
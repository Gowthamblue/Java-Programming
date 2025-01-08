import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set.size());


    }
}

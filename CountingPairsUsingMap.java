import java.util.*;
public class p4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list =new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        Map<Integer,Integer> mp1 = new HashMap<>();
        int count=0;
        for(int i=0;i<list.size();i++)
        {
            int k=list.get(i);
            mp1.put(list.get(i),mp1.getOrDefault(list.get(i),0)+1);
            if(mp1.get(k)==2)
            {
                count++;
                mp1.put(list.get(i),0);                
            }
            
        }
        System.out.println(count);
        sc.close();
    }

    
    
}

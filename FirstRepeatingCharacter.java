import java.util.*;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            Map<Character,Integer> mp = new HashMap<>();
            for(char x:s.toCharArray())
            {
                mp.put(x,mp.getOrDefault(x, 0)+1);
            }
            boolean found = false;

            for(char x:s.toCharArray()) {
                if(mp.get(x)>=2)
                {
                    System.out.println(x);
                    found=true;
                    break;
                }
                    
            }
            if(!found)
            {
                System.out.println(".");
            }

        }
    }
    
}

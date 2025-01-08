import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            Map<Character,Integer> mp1 = new HashMap<>();
            Map<Character,Integer> mp2 = new HashMap<>();
            for (char c : s1.toCharArray()) {
                mp1.put(c, mp1.getOrDefault(c,0)+1);
            }
            for(char c:s2.toCharArray())
            {
                mp2.put(c,mp2.getOrDefault(c,0)+1);
            }
            if(mp1.equals(mp2))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }

                
            }
           


        }
        
    }
    

import java.util.*;

public class demo {
    public static void main(String[] args) {
        String s = "JAVA is a programming langauge";
        String[] rverse = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = rverse.length - 1; i >= 0; i--) {
           // System.out.print(rverse[i] + "  ");
            sb.append(rverse[i]+" ");
        }
        System.out.println(sb);

        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
        Iterator<Integer> ip =hs.iterator();
        while(ip.hasNext()){
            System.out.println(ip.next()+" ");
        }


    }
}

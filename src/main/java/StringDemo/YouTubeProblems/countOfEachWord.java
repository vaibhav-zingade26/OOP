package StringDemo.YouTubeProblems;

import java.util.HashMap;

public class countOfEachWord {
    public static void main(String[] args) {
        int count=0;
        String s ="VaibhavZingade";
        s=s.toLowerCase();
        char[] c = s.toCharArray();
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hp.containsKey(c[i])){
                hp.put(c[i],count++);
            }else {
                hp.put(c[i],1);
            }
        }
        System.out.println(hp);
    }

}

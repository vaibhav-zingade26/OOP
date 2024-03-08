package StringDemo.YouTubeProblems;

import java.util.LinkedList;
import java.util.List;

public class specailCharacterCount {
        public static void main(String[] args) {
        String s ="Vaibhav$%#^ahs";
        // int count=0;
        // LinkedList<Character> ls = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
                // ls.add(s.charAt(i));
                // count++;
                sb.append(s.charAt(i));
            }
    }
        System.out.println(sb);
    }
}

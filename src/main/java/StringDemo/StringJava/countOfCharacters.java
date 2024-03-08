package StringDemo.StringJava;

import java.util.HashMap;

public class countOfCharacters {
    public static void main(String[] args) {
        String str = "picture perfect";
        str =str.replaceAll("\\s","");
        //char[] a=str.toCharArray();
        HashMap<Character,Integer> hp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hp.containsKey(str.charAt(i))) {
                hp.put(str.charAt(i),hp.get(str.charAt(i))+1);
            }else {
                hp.put(str.charAt(i),1);
            }
        }
        System.out.println(hp);
       /* int count;
        for(int i=0;i<str.length();i++){
            count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    str.replace(str.charAt(j),'0');
                }
            }
            if(count>1 && str.charAt(i)!='0'){
                System.out.println(str.charAt(i)+"-"+count);
            }
        }*/

    }
}

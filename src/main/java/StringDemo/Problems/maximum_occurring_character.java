package StringDemo.Problems;


public class maximum_occurring_character {
    public static void main(String[] args) {
        String str = "JAVACCC";
        char [] a = str.toCharArray();
        for (int i=0;i<str.length();i++){
            int count=1;
            char b =str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(b==a[j]){
                    count++;
                    System.out.println(str.charAt(j) +" "+count);
                }
            }
        }

    }
}

package StringDemo;

public class demo {
    public static void main(String[] args) {
        String s = "The: best of both worlds,uisbh; vaibhav.";
        int count=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==':'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)=='.')
            {
                count++;
            }
        }
        System.out.println(count);

    }
}

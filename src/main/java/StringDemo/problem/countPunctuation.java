package StringDemo.problem;

public class countPunctuation {
    public static void main(String[] args) {
        String str = "He said 'The mailman loves you.' I heard it with my own ears.";
        int length = str.length();
        System.out.println(length);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))){
                count++;
            }
        }
        int countOfPunctuation = length-count;
        System.out.println(countOfPunctuation);
    }

}

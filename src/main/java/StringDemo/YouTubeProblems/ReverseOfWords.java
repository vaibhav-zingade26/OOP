package StringDemo.YouTubeProblems;

public class ReverseOfWords {
    public static void main(String[] args) {
        String s ="Java is Programming language";
        String[] a=s.split(" ");
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

}

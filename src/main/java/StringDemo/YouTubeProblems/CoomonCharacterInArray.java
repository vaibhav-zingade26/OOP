package StringDemo.YouTubeProblems;

public class CoomonCharacterInArray {
    public static void main(String[] args) {
        String a="abcde";
        String b="aedif";
        String c="heade";
        String common ="";

        for(char d:a.toCharArray()){
            if(a.indexOf(d)!=-1 && b.indexOf(d)!=-1 && c.indexOf(d)!=-1){
                common+=d;
            }
        }
        System.out.println("Common char is: "+common);
    }
}

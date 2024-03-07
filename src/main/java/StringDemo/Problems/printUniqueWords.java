package StringDemo.Problems;

public class printUniqueWords {
    public static void main(String[] args) {
        String s = "python is the great lang and java is the great lang also python";
        String[] sb = s.split(" ");
        for(int i=0;i<sb.length;i++){
            for(int j=i+1;j<sb.length;j++){
                if(sb[i].equals(sb[j])){
                    System.out.println(sb[i]);
                }
            }
        }
    }
}

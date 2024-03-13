package StringDemo.YouTubeProblems;

public class primeNumber {
    public static boolean isPrimeNumber(int no){
        for(int i=2;i<Math.sqrt(no);i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));
    }
}

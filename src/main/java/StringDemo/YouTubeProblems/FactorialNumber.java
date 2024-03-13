package StringDemo.YouTubeProblems;

public class FactorialNumber {
    public static int factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void isStrongNumber(int No){
        int temp=No;
        int sum=0;
        while(temp>0){
            sum=sum+factorial(temp%10);
            temp=temp/10;
        }
        if(sum==No){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }

    public static void main(String[] args) {
        isStrongNumber(14);
    }
}

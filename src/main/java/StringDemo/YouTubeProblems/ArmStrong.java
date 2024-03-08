package StringDemo.YouTubeProblems;

public class ArmStrong {
    //is number is 4 digit then addition of power of 4 of each digit is equal to that number
    public static int noOfDigit(int input){
        int count=0;
        while(input>0){
            input=input/10;
            count++;
        }
        return count;
    }
    public static boolean isArmStrongNumber(int input){
        int j=input;
        int sum=0;
        int digit=0;

        while(j>0){
            digit=j%10;
            j=j/10;
            sum = sum+(int)Math.pow(digit,noOfDigit(input));
        }
       return sum==input;
    }
    public static void main(String[] args) {
     int i=163;
     if(isArmStrongNumber(i)){
         System.out.println("ArmStrong Number");
     }else {
         System.out.println("Not an ArmStrong Number");
     }
    }
}

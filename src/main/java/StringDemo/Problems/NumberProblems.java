package StringDemo.Problems;

public class NumberProblems {
    public static void main(String[] args) {
      int num=5;
      int m=num/2;
      int flag=0;
      if(num==0||num==1){
          System.out.println("Not Prime number");
      }else{
          for(int i=2;i<m;i++){
              if(num%i!=0){
                 // System.out.println("prime number");
                  flag=1;
                  break;
              }
          }
      }
      if(flag==1){
          System.out.println("not Prime number");
      }else {
          System.out.println(" prime");
      }

    }
}

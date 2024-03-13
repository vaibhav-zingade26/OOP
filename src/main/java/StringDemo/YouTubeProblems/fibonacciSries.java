package StringDemo.YouTubeProblems;

public class fibonacciSries {
    static int n1=0,n2=1,n3=0;
    //using recursive method
    public static void recFibo(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            recFibo(count-1);
        }


    }
    /*public static void fibobacci(int count){
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }*/
    public static void main(String[] args) {
        System.out.print(n1+" "+n2+" ");
        recFibo(10-2);
    }
}

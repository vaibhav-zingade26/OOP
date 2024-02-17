package StringDemo;

import java.util.Scanner;

public class dividedWithequalNumber {
    public static void main(String[] args) {
        String str = "abcavcabhr";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number in which string divides");
        int n=sc.nextInt();
        String [] equalPart = new String[n];
        int chars=(str.length()/n); int temp=0;

        if(str.length()%n != 0){
            System.out.println("String not able to divide in equal parts");
        }else {
            for(int i=0;i<str.length();i=i+chars){
                String part = str.substring(i,i+chars);
                equalPart[temp] = part;
                temp++;
            }
        }
        for(int i=0;i<equalPart.length;i++){
            System.out.print(equalPart[i] +" ");
        }
    }
}
package StringDemo.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sumOfArray {
    public static void main(String[] args) {

        /*int [] a={1,2,3,4,3,2,3,5};
        int num=0;
        for(int i=0;i<a.length;i++){
            num+=a[i];
        }
        System.out.println("sum of array : "+num);*/
       /* String s ="ABHGVFGTY256478597678";
        char a =
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s[i]))
        }*/

       /* int [] a = {1,2,3,5,6,6,6,5,4,9};
        Arrays.sort(a);
        Set<Integer> s=new HashSet<>();
        for(int i:a){
            s.add(i);
        }
        System.out.println(s);*/

        /*String s="vaibhav is a fat fay fat fat is is is boy";
        int count=0;
        String [] a = s.split(" ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(a[i].equals("fat")){
                count++;
            }
        }
        System.out.println(count);*/

   /* String s ="AVGFTE%G&&N7728828BGHEHEN^^7";
    StringBuffer digit=new StringBuffer();
    StringBuffer alpha=new StringBuffer();
    StringBuffer specail=new StringBuffer();

    for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
            digit.append(s.charAt(i));
        }else if(Character.isAlphabetic(s.charAt(i))){
            alpha.append(s.charAt(i));
        }else {specail.append(s.charAt(i));}
    }
        System.out.println(digit.reverse());
    */

        String s= "ABGH%^$$%AVBSHQAyh#";
        char[] a =s.toCharArray();
        int left=0;
        int right=a.length-1;

        while(left<right){
            if(!Character.isLetterOrDigit(a[left])){
                left++;
            }else if(Character.isLetterOrDigit(a[left])&&Character.isLetterOrDigit(a[right])){
                char temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;right--;
            }
            else{
                right--;
            }
        }
        System.out.println(s);
        for(char ab:a){
            System.out.print(ab);
        }
    }
}

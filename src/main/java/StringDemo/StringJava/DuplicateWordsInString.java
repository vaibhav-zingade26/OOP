package StringDemo.StringJava;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String string = "Big black bug bug bit a big black dog on his big black nose";
        String[] a = string.split(" ");
        int count;
        //boolean flag;
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i].equals(a[j])){
                    count++;
                    a[j]="0";
                }
            }
            if(count>1 && a[i]!="0"){
                System.out.println(a[i]);
            }

        }
    }
}

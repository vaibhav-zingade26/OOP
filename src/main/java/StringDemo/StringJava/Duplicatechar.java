package StringDemo.StringJava;

public class Duplicatechar {
    public static void main(String[] args) {
        String string = "Great responsibility";
        int count;
        char[] a =string.toCharArray();
        for(int i=0;i<a.length;i++){
            count =1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]='0';
                }
            }
            if(count>1&& a[i]!='0'){
                System.out.println(a[i]+":"+count);
            }
        }

    }
}

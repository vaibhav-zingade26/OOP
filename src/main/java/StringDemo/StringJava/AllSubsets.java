package StringDemo.StringJava;

public class AllSubsets {
    public static void main(String[] args) {
        String str = "VAIBHAV";
        //possible subset is (n*(n+1))/2
        int l=str.length();
        int noOfSubset=(l*(l+1)/2);
        int count=0;
        String[] subset = new String[noOfSubset];

        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                subset[count]= str.substring(i,j+1);
                count++;
            }
        }
        for(String s:subset){
            System.out.print(s+" ");
        }
        System.out.println("");
        System.out.println(count+1);


    }

}

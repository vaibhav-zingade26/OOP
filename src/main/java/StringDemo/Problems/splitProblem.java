package StringDemo.Problems;

public class splitProblem {
    public static void main(String[] args) {
        String s="Java,Selenium,TestNG,Maven";
        String[] name = s.split(",");
        for(String n: name){
            System.out.print(n+" ");
        }

        String s1="ABC";
        String s2="PQR";
        String s3="XYZ";
       // String s4=s1+s2+s3;
        String s4 = s1.concat(s2).concat(s3);
        System.out.println(s4);

        StringBuffer a = new StringBuffer(s1);
        a.append(s2);
        a.append(s3);
        System.out.println(a);

        int ab=10;
        int bc=20;
        int large=ab>bc?ab:bc;
        System.out.println("large number is= "+ large);

        String hf ="WekcwhddeJHdswydndwedSDwdxsdn";
        String vaibhav =hf.toUpperCase();
        char [] lowerC = vaibhav.toCharArray();
        int count=0;
        for(int i=0;i<vaibhav.length();i++){
            if(Character.isLowerCase(lowerC[i])){
                count++;
            }
        }
        System.out.println("lower alphabate presents are : "+count);



    }
}

package StringDemo.Problems;

public class problem4 {
    public static void main(String[] args) {
        String s ="vajih35@#$64jhhdt767!@#$";
        StringBuffer digit = new StringBuffer();
        StringBuffer character=new StringBuffer();
        StringBuffer special=new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                digit.append(s.charAt(i));
            }else if(Character.isAlphabetic(s.charAt(i))){
                character.append(s.charAt(i));
            }else{
                special.append(s.charAt(i));
            }
        }
        System.out.println("digit array: "+digit+" character array: "+character+" Special :"+special);

        String onlyChar = s.replaceAll("[^A-Za-z]","");
        String onlyDigit = s.replaceAll("[^0-9]","");

        System.out.println("onlyDigit : "+onlyDigit);
        System.out.println("onlyChar : "+onlyChar);
    }


}

package StringDemo;

public class maxOccuringChar {
    public static void main(String[] args) {
        String a = "ab  bcc   cddd     eeee";
        a=a.replaceAll("\\s","");
        System.out.println(a);

        int[] arr = new int[127];

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)] = arr[a.charAt(i)] + 1;
        }
        int max = -1;
        char c = ' ';
        for (int i = 0; i <a.length(); i++) {
            if (max < arr[a.charAt(i)]) {
                max=arr[a.charAt(i)];
                c=a.charAt(i);
            }
        }
        System.out.println("max char are "+c);
    }
}


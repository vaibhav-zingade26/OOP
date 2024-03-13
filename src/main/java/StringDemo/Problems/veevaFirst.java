package StringDemo.Problems;

public class veevaFirst {
    public static boolean compareTwoString(int[] a, int[] b) {

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3};
        int[] c ={1,2,3,4};
        System.out.println(compareTwoString(a,b));
    }

}
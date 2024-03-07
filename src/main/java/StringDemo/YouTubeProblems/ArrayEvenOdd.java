package StringDemo.YouTubeProblems;

public class ArrayEvenOdd {
    public static void arrayEvenOdd(int[] arr1){
        int[] arr2=new int[arr1.length];
        int index=0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                arr2[index]=arr1[i];
                index++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2!=0){
                arr2[index]=arr1[i];
                index++;
            }
        }
        for(int a:arr2){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 7, 8, 11, 20};
        arrayEvenOdd(arr1);
    }
}

package StringDemo.StringJava;

public class linearSearch {
    public static int linearSeachFromArray(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,6,34,4,7};
        System.out.println("index of a key : "+linearSeachFromArray(array,34));
    }
}

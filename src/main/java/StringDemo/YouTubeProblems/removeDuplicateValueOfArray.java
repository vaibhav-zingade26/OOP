package StringDemo.YouTubeProblems;

public class removeDuplicateValueOfArray {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        int j=0;

        for(int i=0; i<length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }

        }
        arr[j++] = arr[length-1];
        //int l =j;
        for (int i=0; i<j; i++)
            System.out.print(arr[i]+" ");
       /* int[] a = {12,23,12,12,33,44,32,34,23,43};
        //using for loop
        int index=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[index]=a[i];
                index++;
            }
        }
        for(int b:a){
            System.out.print(b+" ");
        }
*/


    }
}

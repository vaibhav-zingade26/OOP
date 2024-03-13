package StringDemo.problem;

public class minMaxNumberFromArray {
    public static void main(String[] args) {
        int [] arr ={25, 11, 7, 75, 56};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("min: "+min);

        //ascendingOrder
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println(' ');
        //decendingOrder
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}

package Array;

public class frequencyOfNumber {
    public static void main(String[] args) {
        int[] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr =new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=-1;
                }
            }
            if(fr[i]!=-1){
                fr[i]=count;
            }
        }
    }
}

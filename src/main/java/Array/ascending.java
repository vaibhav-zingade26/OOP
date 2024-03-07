package Array;

public class ascending {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,5,8,6};
        boolean isAsending = true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAsending=false;
            }
        }
        if(isAsending){
            System.out.println("numbers are in asending orders");
        }else {
            System.out.println("numbers are in not asending orders");
        }
    }
}

package StringDemo.ExceptionHandling;

public class throwDemo {
    public static void validate(int age){
        try{
            int c=age/0;
            System.out.println(c);

        }catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        }

       /* if(age<18){
            throw new ArithmeticException("Person is less that 18");
        }else {
            System.out.println("person is eligible to vote");
        }*/
    }

    public static void main(String[] args) {
        validate(13);
    }
}

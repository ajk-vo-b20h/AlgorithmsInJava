package chapter01;

public class Fib1 {
    //This method generates a java.lang.StackOverflowError
    private static int fib1(int n){
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void main(String[]args){
        //Do not run
        System.out.println(fib1(5));
    }
}

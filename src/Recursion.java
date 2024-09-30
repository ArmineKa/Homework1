public class Recursion {
    public static void main(String[] args) {
// 2. Write a function int fib(int n) that returns Fn (n- th Fibonacci number). User recursion. Is there a better way doing this?
        int n = 3;
        System.out.println(fibonacci(n));
        int n1 = 6;
        System.out.println(factorial(n1));
        System.out.println(degree(2,3));
        System.out.println(sum(7));
        System.out.println(isPal("anna"));
    }

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        int fib = fibonacci(n - 1) + fibonacci(n - 2);
        return fib;

    }

    //3.  Write a function  int fact(int n) that returns the factorial of n. Use recursion.
    public static int factorial(int n1) {
        if (n1 <= 1) {
            return n1;
        }
        int fact = n1 * factorial(n1 - 1);
        return fact;
    }
    //5.  Given an array, write functions to find the minimum and the maximum elements in it. Use recursion.
   /* int[] arrayRecursion ={1,2,3,4,5,6,7};

    public static int findMinElement(int[] arrayRecursion, int n2) {
        if (n2 == 0) {
            return arrayRecursion[n2];
        }
        int minOfArray = findMinElement(arrayRecursion, n2 - 1);
        return Math.min(arrayRecursion[n2], minOfArray);


    }
    public static int findMaxElement(int[] arrayRecursion, int n2) {
        if (n2 == 0) {
            return arrayRecursion[n2];
        }
        int maxOfArray = findMaxElement(arrayRecursion, n2 - 1);
        return Math.max(arrayRecursion[n2], maxOfArray);
}*/

// 4. Given integers n and k write a function that returns the value of nk. Use two different recursive approaches.
    int n3 = 2;
    int k = 3;
    public  static int degree (int n3, int k){
        if (k==0)
            return 1;
        else return n3* degree (n3,k-1);
}
//8. Given a number n, find the sum of its digits. Use recursion.

    int n4 =15;
    public static int sum (int n4){
if(n4==0)
    return n4;
else
    return (n4 % 10 + sum(n4 / 10));
    }

//7. Given a string, write a function to check if it is palindrome or not.

    public static boolean isPal(String s){
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        return false;
    }



}

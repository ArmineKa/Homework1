public class Characters {
    public static void main(String[] args) {
        //Write a program that reads a string from the user and prints the total number of characters in that string.

        String a = "Hello";
        char[] count = a.toCharArray();
        int count1 = count.length;
        System.out.println("The string has " + count1 + " characteres");


        //Write a program that takes a string as input and prints each character of the string on a new line.

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);


        //Write a program that reads a string and an integer from the user, then prints the string repeated that many times.


        }
        String a1 = a+a+a;
        System.out.println(a1);
    }
}

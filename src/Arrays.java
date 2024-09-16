public class Arrays {
    public static void main(String[] args) {
        // Write a program that finds the maximum and the minimum value of an integer array
        int[] minMaxArray = {5, 70, 9, 10, 3, 2, 1};
        int max = minMaxArray[0];
        int min = minMaxArray[0];
        for (int i : minMaxArray) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);


        // Write a program that removes the given element from an array

        int[] removeElement = {1, 2, 3, 4};
        int[] finalArray = new int[removeElement.length - 1];
        int j = 0;

        for (int i = 0; i < removeElement.length; i++) {
            if (removeElement[i] != 2) {
                finalArray[j++] = removeElement[i];

            }
        }
        System.out.println(java.util.Arrays.toString(finalArray));
    }
}

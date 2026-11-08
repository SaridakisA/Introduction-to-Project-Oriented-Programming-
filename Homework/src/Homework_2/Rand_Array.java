package Homework_2;

import java.util.Arrays;

public class Rand_Array {
    public static void main(String[] args) {
        int[] arr = {30, 13 , 47, 21, 83, 15, 54, 9, 72, 54};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("The biggest number in the array is: " + max);

        int n =  arr.length;
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] % 2) == 0)
                countEven += 1;

            else
                countOdd += 1;
        }

        System.out.println("Even is: " + countEven);
        System.out.println("Odd is: " + countOdd);
    }
}

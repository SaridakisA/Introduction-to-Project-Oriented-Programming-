package Homework_1;

import java.util.Random;

public class Dice_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        for (x=0;x<1000;x++){   // Make the die roll 1000 times (a-f are the die numbers)
            int i = rand.nextInt(1,7);  // The die

            // Adding 1 to the corresponding number whenever its rolled

            if (i == 1){
                a++;
            }
            else if (i == 2){
                b++;
            }
            else if (i == 3){
                c++;
            }
            else if (i == 4){
                d++;
            }
            else if (i == 5){
                e++;
            }
            else if (i == 6){
                f++;
            }
        }
        System.out.println("1 was rolled: " + a + " times.");
        System.out.println("2 was rolled: " + b + " times.");
        System.out.println("3 was rolled: " + c + " times.");
        System.out.println("4 was rolled: " + d + " times.");
        System.out.println("5 was rolled: " + e + " times.");
        System.out.println("6 was rolled: " + f + " times.");

    }
}
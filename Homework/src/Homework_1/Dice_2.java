package Homework_1;

import java.util.Random;

public class Dice_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(1, 7);
        int b = rand.nextInt(1, 7);
        int c = rand.nextInt(1, 7);
        int d = rand.nextInt(1, 7);
        System.out.println("User " + a + " and " + b + ", total: " + (a + b));
        System.out.println("Computer " + c + " and " + d + ", total: " + (c + d));
        if ((a + b) > (c + d)) {
            System.out.println("User wins");
        } else if ((a + b) < (c + d)) {
            System.out.println("Computer wins");
        } else {
            System.out.println("its a tie");
        }
    }
}
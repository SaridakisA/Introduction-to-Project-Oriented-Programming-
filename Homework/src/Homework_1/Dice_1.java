package Homework_1;

import java.util.Random;

public class Dice_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(1,6);
        System.out.println("Dice result: " + a);
    }
}
package Homework_3;

import java.util.ArrayList;
import java.util.Random;

public class Dragon {
    private ArrayList<Riddle> riddles;
    private Riddle selectedRiddle;
    private boolean acceptQuestions;
    private Chest chestWithKey;

    public Dragon() {
        acceptQuestions = true;
        chestWithKey = null;
        riddles = new ArrayList<>();
        riddles.add(new Riddle("I have cities, but houses." +
                "I have mountains, but no trees." +
                "I have water, but no fish." +
                "What am I?", "Map"));
        riddles.add(new Riddle("I speak without a mouth and hear without ears." +
                "I have a body, but I come alive with wind." +
                "What am I?", "Echo"));
        riddles.add(new Riddle("I am full of holes, yet I still hold water." +
                "What am I?", "Sponge"));
        riddles.add(new Riddle("What has to be broken before you can use it" +
                "What is it", "Egg"));
        riddles.add(new Riddle("I have a single eye, but i cannot see." +
                "I have sharp point, but I am not a weapon." +
                "What am I?", "Needle"));
    }

    public void setChest(Chest chest) {
        this.chestWithKey = chest;
    }

    public String askQuestion() {
        if (!acceptQuestions) {
            return "You were wrong before, no more riddles.";
        }
        Random rand = new Random();
        int pos = rand.nextInt(riddles.size());
        selectedRiddle = riddles.get(pos);
        return selectedRiddle.getQuestion();
    }

    public boolean checkAnswer(String answer) {
        return selectedRiddle.checkAnswer(answer);
    }

    public String respond(String answer) {
        if (!acceptQuestions) {
            return "You were wrong before, no more riddles.";
        }
        if (checkAnswer(answer)) {
            return "Correct! Key is in..." + chestWithKey.getType() + "chest";
        } else {
            acceptQuestions = false;
            return "Wrong! Get Lost.";
        }
    }
}
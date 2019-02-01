package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Random r = new Random();

        int rand1; //random number 1
        int rand2; // random number 2

        int sum; //sum of random numbers 1 + 2
        int score = 0; //current score + sum of 2 random numbers



        while (score < 100) {
            System.out.println("Roll a dice");
            rand1 = r.nextInt(6) + 1;
            rand2= r.nextInt(6) + 1;

            sum = rand1 + rand2;
            System.out.println("try again your rolled dices were " + rand1 + " and " + rand2);
            score = score + sum;
            System.out.println("Current score is " + score);

            if ((rand1 == 1) || (rand2 == 1)){
                System.out.println("Rolled dices were: " + rand1 + " & " + rand2);
                System.out.println("No score change because 1 is thrown on either die");
                score = score + 0;

            }

            else if ((rand1 == 1) && (rand2 == 1)){

                score = score + 25;
                System.out.println("Rolled 1 twice" + score);
            }

            //System.out.println ("score is: " + score + " therefore exir");
            //System.out.println(score + " is above or equal to 100, therefore the game is over!!");

        }
        System.exit(0);




    }
}

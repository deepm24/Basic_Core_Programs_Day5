package org.example;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args)
    {

        Random rnd = new Random();
        int checkRandom = 2;
        int intRandom = rnd.nextInt(checkRandom);

        if (intRandom == 1)
        {
            System.out.println("Head");
        }
        else
        {
            System.out.println("Tail");
        }
    }

}
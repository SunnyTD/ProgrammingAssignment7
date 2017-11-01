/**
 * Daniel Plotzke
 * Testing:
 * 1. Tested random number generation by printing values into console. (raw)
 * 2. Tested random num. gen. by printing randomInt (arraylist) values into console.
 * 3. Tested linear search using basic arrays, then copied and modified to work with array lists.
 * 4. Test more times for reliability.
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> randomInt = new ArrayList<>();
        // Assigns range of random number values.
        int max = 100;
        int min = 1;
        // Runs 10 times. Creates random number, and then assigns that number to a place in the array list.
        for (int iterations = 0; iterations < 10; iterations++)
        {
            // Gets random number int between 1(min) and 100(max).
            int randomNumber = (int) (Math.random() * 100) + 1;
            randomInt.add(randomNumber);
//            System.out.println(randomInt.get(iterations));
        }
        // Layout of printing table of values for the random #s
        final int amountOfRandom = 10;
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%5s", randomInt.get(i));
        }
        // Prompts user for a value to search for.
        System.out.println();
        System.out.println("Enter an integer to search for in the randomInt array list: ");
        int searchedValue = in.nextInt();
        // Uses linear search to find user's value.
        // Searches for the position in the array that is equal to user's int input:
        int pos = 0;
        boolean found = false;
        while (pos < randomInt.size() && !found)
        {
            if (randomInt.get(pos) == searchedValue)
            {
                found = true;
            }
            else
            {
                pos++;
            }
        }
        if (found)
        {
            System.out.println("Found at position: " + pos);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}

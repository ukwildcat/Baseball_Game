/*
 * This project uses classes to simulate a batter facing a pitcher in a 
 * baseball game.
 * 
 */
package project4_lawson;

import java.util.Scanner;

/**
 * Stacey Lawson
 * 1180L-07
 * Goshtasby
 * Project 4
 */
public class Project4_Lawson {

    /**
     * This is the main method. It calls from both the batter and pitcher
     * classes to get the names and averages for both. It also prints out the
     * number of balls and strikes and whether the batter gets a hit.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instatiates batter and pitcher objects
        Batter batter = new Batter();
        Pitcher pitcher = new Pitcher();

        //Call getName method for both classes
        batter.getName();
        pitcher.getName();
        //Call getAverage method for both classes
        batter.getAverage();
        pitcher.getAverage();
        //set count variables to keep track of balls and strikes
        int ballCount = 0;
        int strikeCount = 0;

        //Ask user for batter's name
        Scanner input = new Scanner(System.in);
        System.out.println("What is the batter's name? ");
        batter.name = input.nextLine();

        //Ask user for pitcher's name
        System.out.println("What is the pitcher's name? ");
        pitcher.name = input.nextLine();

        //Ask user for batter's average
        System.out.println("What is the batter's average (decimal between 0"
                + " and 1)? ");
        batter.setAverage(input.nextDouble());

        //Ask user for pitcher's average
        System.out.println("What is the pitcher's average (decimal between 0"
                + " and 1)? ");
        pitcher.setAverage(input.nextDouble());

        //Print who the pitcher and batter are 
        System.out.println(pitcher.name + " is pitching to "
                + batter.name);

        //Start loop
        for (int i = 0; i < 20; i++) {
            //Call batter.hit and pitcher.pitch methods 
            boolean b = batter.hit();
            boolean p = pitcher.pitch();

            //Determine if it is a hit and quit program if so
            if (b && p) {
                System.out.println(batter.name + " got a hit!");
                break;
                //Determine if it is a strike and add to count
            } else if (!b && p) {
                System.out.println("\t" + batter.name + " swung and missed");
                strikeCount++;
                //Determine if it is a ball and add to count    
            } else {
                System.out.println("\t" + pitcher.name + " threw a ball");
                ballCount++;
            }
            //Print out status after each iteration
            if (strikeCount < 3 && ballCount < 4) {
                System.out.println("\tThe count is " + ballCount + " balls and "
                        + strikeCount + " strikes");
            }
            //Once ball count is 4, print statement and quit
            if (ballCount == 4) {
                System.out.println(batter.name + " walked");
                break;
            }
            //Once strike count is 3, print statement and quit
            if (strikeCount == 3) {
                System.out.println(batter.name + " struck out");
                break;
            }
        }
    }//end main method
}

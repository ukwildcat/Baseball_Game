/*
 * This class is designed to set up a batter for a baseball simulator
 */
package project4_lawson;

/**
 * Stacey Lawson
 * 1180L-07
 * Goshtasby
 * Project 4 - Batter Class
 */
public class Batter {

    String name;
    private String position;
    private double average;

    /**
     * Sets the name for the batter precondition - none postcondition - none
     *
     * @param name the name of the batter
     */
    public void setName(String name) {
        this.name = name;
    }//end setName method

    /**
     * Sets the name for position precondition - none postcondition - none
     *
     * @param position the position type
     */
    public void setPosition(String position) {
        this.position = position;
    }//end setPosition method

    /**
     * Sets the batter average precondition - none postcondition - none
     *
     * @param average for batter
     */
    public void setAverage(double average) {
        this.average = average;
    }//end setAverage method

    /**
     * Returns the name of the batter precondition - the name of the batter has
     * been set postcondition - none
     *
     * @return name of the batter
     */
    public String getName() {
        return name;
    }//end getName method

    /**
     * Returns the position precondition - position has been set postcondition -
     * none
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }//end getPosition method

    /**
     * Returns the batter average precondition - batter average has been set
     * postcondition - none
     *
     * @return batter average
     */
    public double getAverage() {
        return average;
    }//end getAverage method

    /**
     * This method assumes that a pitcher has thrown a strike and uses the
     * batter's average to determine whether he hits the pitch or swings and
     * misses.
     *
     * @return boolean
     */
    public boolean hit() {
        double number = Math.random();
        if (average > number) {
            return true;
        } else {
            return false;
        }
    }//end hit method
}//end Batter class

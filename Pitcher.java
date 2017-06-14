/*
 * This class is designed to set up a pitcher for a baseball simulator
 */
package project4_lawson;

/**
 * Stacey Lawson
 * 1180L-07
 * Goshtasby
 * Project 4 - Pitcher Class
 */
public class Pitcher {

    String name;
    private String position;
    private double strikeAverage;

    /**
     * Sets pitcher name precondition - none postcondition - none
     *
     * @param name the name of the pitcher
     */
    public void setName(String name) {
        this.name = name;
    }//end setName method

    /**
     * Sets position precondition - none postcondition - none
     *
     * @param position position type
     */
    public void setPosition(String position) {
        this.position = position;
    }//end setPosition method

    /**
     * Sets pitcher strike average precondition - none postcondition - none
     *
     * @param strikeAverage the pitcher strike average
     */
    public void setAverage(double strikeAverage) {
        this.strikeAverage = strikeAverage;
    }//end setAverage method

    /**
     * Returns pitcher name precondition - the name of pitcher has been set
     * postcondition - none
     *
     * @return pitcher name
     */
    public String getName() {
        return name;
    }//end getName method

    /**
     * Returns position precondition - position has been set postcondition -
     * none
     *
     * @return position
     */
    public String getPosition() {
        return position;
    }//end getPosition method

    /**
     * Returns the pitcher strike average precondition - pitcher strike average
     * has been set postcondition - none
     *
     * @return pitcher strike average
     */
    public double getAverage() {
        return strikeAverage;
    }

    /**
     * This method uses the pitcher's average to determine whether he throws a
     * strike or a ball
     *
     * @return boolean
     */
    public boolean pitch() {
        double number = Math.random();
        if (strikeAverage > number) {
            return true;
        } else {
            return false;
        }
    }//end pitch method
}//end Pitcher class

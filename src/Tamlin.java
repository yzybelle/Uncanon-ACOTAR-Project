/**
 * This class creates an object that has both anger and love.
 * The methods created would quantify the number of anger/love the
 * instance object would have, as well as retrieve it
 */

public class Tamlin {
    int anger;
    int love;

    /**
     * Constructor for the Tamlin class. This creates a new instance of Tamlin
     * with the stats anger and love.
     */
    Tamlin(){
        this.anger = 0;
        this.love = 0;
    }

    /**
     * addAnger method for the Tamlin class. This method will return an
     * integer that represents the anger stat of the instance increased by one.
     *
     * @return returns an integer that represents the anger stat of the instance.
     */
    public int addAnger(){
        anger++;
        return anger;
    }
    /**
     * minusAnger method for the Tamlin class. This method will return an
     * integer that represents the anger stat of the instance decreased by one.
     *
     * @return returns an integer that represents the anger stat of the instance.
     */
    public int minusAnger(){
        anger--;
        return anger;
    }
    /**
     * minusLove method for the Tamlin class. This method will return an
     * integer that represents the love stat of the instance decreased by one.
     *
     * @return returns an integer that represents the love stat of the instance.
     */
    public int minusLove(){
        love--;
        return love;
    }
    /**
     * addLove method for the Tamlin class. This method will return an
     * integer that represents the love stat of the instance increased by one.
     *
     * @return returns an integer that represents the love stat of the instance.
     */
    public int addLove(){
        love++;
        return love;
    }
    /**
     * getAnger method for the Tamlin class. This method will return an
     * integer that represents the anger stat of the instance.
     *
     * @return returns an integer that represents the anger stat of the instance.
     */
    public int getAnger() {

        return anger;
    }
    /**
     * getLove method for the Tamlin class. This method will return an
     * integer that represents the love stat of the instance.
     *
     * @return returns an integer that represents the love stat of the instance.
     */
    public int getLove() {

        return love;
    }
}

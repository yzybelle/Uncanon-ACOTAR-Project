/**
 * This class creates an object that has karma.
 * The methods created would quantify the number of karma the
 * instance object would have, as well as retrieve it
 */


public class Feyre {
    int karma;
    /**
     * Constructor for the Feyre class. This creates a new instance of Feyre
     * with the stats karma.
     */
    Feyre(){

        this.karma = 0 ;
    }
    /**
     * addKarma method for the Feyre class. This method will return an
     * integer that represents the karma stat of the instance increased by one.
     *
     * @return returns an integer that represents the karma stat of the instance.
     */
    public int addKarma() {

        karma++;
        return karma;
    }
    /**
     * minusKarma method for the Feyre class. This method will return an
     * integer that represents the karma stat of the instance decreased by one.
     *
     * @return returns an integer that represents the karma stat of the instance.
     */
    public int minusKarma() {

        karma--;
        return karma;
    }
    /**
     * getKarma method for the Feyre class. This method will return an
     * integer that represents the karma stat of the instance.
     *
     * @return returns an integer that represents the karma stat of the instance.
     */
    public int getKarma() {

        return karma;
    }
}

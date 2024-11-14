public class Tamlin {
    int anger;
    int love;

    Tamlin(){
        this.anger = 0;
        this.love = 0;
    }

    public int addAnger(){
        anger++;
        return anger;
    }
    public int minusAnger(){
        anger--;
        return anger;
    }
    public int minusLove(){
        love--;
        return love;
    }
    public int addLove(){
        love++;
        return love;
    }

    public int getAnger() {
        return anger;
    }

    public int getLove() {
        return love;
    }
}

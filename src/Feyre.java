public class Feyre {
    int karma;

    Feyre(){
        this.karma = 0 ;
    }

    public int addkarma() {

        karma++;
        return karma;
    }

    public int minuskarma() {

        karma--;
        return karma;
    }

    public int getKarma() {
        return karma;
    }
}

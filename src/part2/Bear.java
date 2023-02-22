package part2;

public class Bear extends Animal {

    boolean sleeping = false;

    Bear(int weight, Season season) {
        super(0, null, Color.BROWN);
    }
    public void changeSeason(Season season) {
        switch (season){
            case WINTER -> {
                weight *= 0.8;
                sleeping = true;
            }
            case SPRING -> weight *= 0.75;
            case SUMMER -> weight *= 1.33;
            case FALL -> weight *= 1.25;
        }
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public String toString() {
        if(sleeping)
            return "Bear. I am sleeping. " +
                    "My weight is: " + weight +
                    "and my color is: " + color;
        return "Bear. " +
                "My weight is: " + weight +
                "and my color is: " + color;
    }

}

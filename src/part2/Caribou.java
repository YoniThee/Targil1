package part2;

public class Caribou extends Animal {

    String migratingDir;

    Caribou(int weight, Season season) {
        super(0, null, null);
        migratingDir = "";
    }
    public void changeSeason(Season season) {
        switch (season){
            case WINTER -> {
                color = Color.WHITE;
                migratingDir = "south";
            }
            case SPRING -> color = Color.BROWN;
            case SUMMER -> migratingDir = "north";
            case FALL -> weight *= 1.25;
        }
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public String toString() {
        if (migratingDir != "")
            return "Caribou: I am migrating " + migratingDir +
                    ". My weight is: " + weight +
                    "and my color is: " + color;
        return "Caribou: " +
                "My weight is: " + weight +
                "and my color is: " + color;
    }
}

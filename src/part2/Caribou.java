package part2;


public class Caribou extends Animal {

    String migratingDir;

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        migratingDir = "";
    }


    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season){
            case WINTER:
                color = Color.WHITE;
                migratingDir = "south";
                break;
            case SPRING:
                color = Color.BROWN;
                break;
            case SUMMER:
                migratingDir = "north";
                break;
            case FALL:
                weight *= 1.25;
                break;
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
                    " and my color is: " + color.name();
        return "Caribou: " +
                "My weight is: " + weight +
                " and my color is: " + color.name();
    }
}

package part2;

import java.lang.Math;

public class Bear extends Animal {

    boolean sleeping = false;

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);

    }


    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season){
            case WINTER:
                weight *= 0.8;
                sleeping = true;
                break;
            case SPRING:
                weight *= 0.75;
                break;
            case SUMMER:
                weight *= 1.33;
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
        if(sleeping)
            return "Bear. I am sleeping. " +
                    "My weight is: " + weight +
                    " and my color is: " + color.name();
        return "Bear. " +
                "My weight is: " + weight +
                " and my color is: " + color.name();
    }

}

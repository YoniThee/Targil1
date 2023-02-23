package part2;

public class Bear extends Animal {

    boolean sleeping = false;

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
        changeSeason(season);
    }
    public void changeSeason(Season season) {
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

//public class Bear extends Animal {
//
//    boolean sleeping = false;
//
//    Bear(int weight, Season season) {
//        super(weight, season, Color.BROWN);
//    }
//    public void changeSeason(Season season) {
//        switch (season){
//            case WINTER -> {
//                weight *= 0.8;
//                sleeping = true;
//            }
//            case SPRING -> weight *= 0.75;
//            case SUMMER -> weight *= 1.33;
//            case FALL -> weight *= 1.25;
//        }
//    }
//
//    @Override
//    public Season getCurrentSeason() {
//        return season;
//    }
//
//    @Override
//    public String toString() {
//        if(sleeping)
//            return "Bear. I am sleeping. " +
//                    "My weight is: " + weight +
//                    " and my color is: " + color.name();
//        return "Bear. " +
//                "My weight is: " + weight +
//                " and my color is: " + color.name();
//    }
//
//}

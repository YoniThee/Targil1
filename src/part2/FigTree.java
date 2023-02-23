package part2;

public class FigTree extends Tree{

    boolean fruit;

    FigTree(int height, Season season) {
        super(height,season,null);
        fruit = false;
        changeSeason(season);
    }

    public void changeSeason(Season season) {
        switch (season){
            case WINTER:
                height += 20;
                leavesColor = Color.BROWN;
                break;
            case SPRING:
                height += 30;
                leavesColor = Color.GREEN;
                break;
            case SUMMER:
                height += 30;
                leavesColor = Color.GREEN;
                fruit = true;
                break;
            case FALL:
                height += 20;
                leavesColor = Color.YELLOW;
                break;
        }
    }
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public String toString() {
        if (fruit)
            return "Fig tree. I give fruit. " +
                    "My height is: " + height +
                    " and my color is: " + leavesColor.name();

        return "Fig tree. " +
                "My height is: " + height +
                " and my color is: " + leavesColor.name();
    }
}

//public class FigTree extends Tree{
//
//    boolean fruit;
//
//    FigTree(int height, Season season) {
//        super(height,season,null);
//        fruit = false;
//        changeSeason(season);
//    }
//
//    public void changeSeason(Season season) {
//        switch (season){
//            case WINTER -> {
//                height += 20;
//                leavesColor = Color.BROWN;
//            }
//            case SPRING ->{
//                height += 30;
//                leavesColor = Color.GREEN;
//            }
//            case SUMMER ->{
//                height += 30;
//                leavesColor = Color.GREEN;
//                fruit = true;
//            }
//            case FALL -> {
//                height += 20;
//                leavesColor = Color.YELLOW;
//            }
//        }
//    }
//    @Override
//    public Season getCurrentSeason() {
//        return season;
//    }
//
//    @Override
//    public String toString() {
//        if (fruit)
//            return "Fig tree. I give fruit. " +
//                    "My height is: " + height +
//                    " and my color is: " + leavesColor.name();
//
//        return "Fig tree. " +
//                "My height is: " + height +
//                " and my color is: " + leavesColor.name();
//    }
//}

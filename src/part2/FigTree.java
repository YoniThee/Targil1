package part2;

public class FigTree extends Tree{

    boolean fruit;

    FigTree(int height, Season season) {
        super(0,null,null);
        fruit = false;
    }

    public void changeSeason(Season season) {
        switch (season){
            case WINTER -> {
                height += 20;
                leavesColor = Color.BROWN;
            }
            case SPRING ->{
                height += 30;
                leavesColor = Color.GREEN;
            }
            case SUMMER ->{
                height += 30;
                fruit = true;
            }
            case FALL -> {
                height += 20;
                leavesColor = Color.YELLOW;
            }
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
                    "and my color is: " + leavesColor;

        return "Fig tree. " +
                "My height is: " + height +
                "and my color is: " + leavesColor;
    }
}

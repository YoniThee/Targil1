package part2;


public class FigTree extends Tree{

    boolean fruit;

    FigTree(int height, Season season) {
        super(height, season, Color.YELLOW);
        fruit = false;
    }


    @Override
    public void changeSeason() {
        super.changeSeason();
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
                fruit = false;
                break;
        }
    }


    @Override
    public Season getCurrentSeason() {
        return season;
    }


    @Override
    public String toString() {
        if (!fruit)
            return "Fig tree. " +
                    "My height is: " + height +
                    " and my color is: " + leavesColor.name();

        return "Fig tree. I have no leaves. " +
                "My height is: " + height +
                " and my color is: " + leavesColor.name();
    }
}

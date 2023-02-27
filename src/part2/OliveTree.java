package part2;
public class OliveTree extends Tree {

    boolean fruit;
    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height, season, Color.GREEN);
        fruit = true;
    }


    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season){
            case WINTER:
                height += 5;
                fruit = false;
                break;
            case SPRING:
                height += 10;
                break;
            case SUMMER:
                height += 10;
                break;
            case FALL:
                height += 5;
                fruit = true;
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
            return "Olive tree. I give fruit. " +
                    "My height is: " + height +
                    " and my color is: " + leavesColor.name();

        return "Olive tree. " +
                "My height is: " + height +
                " and my color is: " + leavesColor.name();
    }
}

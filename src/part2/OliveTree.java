package part2;

public class OliveTree extends Tree {

    boolean fruit;
    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(0,null,null);
        fruit = false;
    }

    public void changeSeason(Season season) {
        switch (season){
            case WINTER -> height += 5;
            case SPRING, SUMMER -> height += 10;
            case FALL -> {
                height += 5;
                fruit = true;
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

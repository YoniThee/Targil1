package part2;

public abstract class Tree implements Seasonable,Comparable<Tree>{
    int height;
    Color leavesColor;
    Season season;

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public int compareTo(Tree tree) {
        return Integer.compare(height, tree.height);
    }

    @Override
    public void changeSeason() {
        season = Season.values()[(season.ordinal() + 1) % 4];
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", color=" + leavesColor +
                ", season=" + season +
                '}';
    }
}

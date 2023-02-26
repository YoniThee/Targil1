package part2;

public abstract class Animal implements Seasonable, Comparable<Animal> {
    protected int weight;
    protected Season season;
    protected Color color;


    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }


    @Override
    public int compareTo(Animal animal) {
        return Integer.compare(weight, animal.weight);
    }


    @Override
    public void changeSeason() {
        season = Season.values()[(season.ordinal() + 1) % 4];
    }


    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", color=" + color +
                ", season=" + season +
                '}';
    }
}

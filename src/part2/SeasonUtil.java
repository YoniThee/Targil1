package part2;
import java.util.ArrayList;
import java.util.Arrays;


public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
            Arrays.sort(seasonables);
    }


    static String reportAll(Seasonable[] seasonables) {
        String ans = "";
        for (Seasonable item: seasonables) {
            ans += item.toString();
            ans += '\n';
        }
        return ans;
    }
}

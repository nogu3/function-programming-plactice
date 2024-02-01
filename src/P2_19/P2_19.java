package P2_19;

import java.util.List;

public class P2_19 {
    public static void main(String[] args) {
        System.out.println(getTipPercentage(List.of("a", "b", "c", "d", "e", "f")) == 20);
        System.out.println(getTipPercentage(List.of("a", "b", "c", "d", "e")) == 10);
        System.out.println(getTipPercentage(List.of()) == 0);
    }

    public static int getTipPercentage(List<String> names) {
        if (names.size() > 5) {
            return 20;
        }

        if (names.size() > 0) {
            return 10;
        }

        return 0;
    }
}

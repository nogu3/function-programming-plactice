package P2_18;

import java.util.List;

public class P2_18 {
    public static void main(String[] args) {
        System.out.println(getDiscountPercentage(List.of("Apple")) == 0);
        System.out.println(getDiscountPercentage(List.of("Book")) == 5);
    }

    public static int getDiscountPercentage(List<String> items) {
        if (items.contains("Book")) {
            return 5;
        } else {
            return 0;
        }
    }
}

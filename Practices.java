import java.math.BigDecimal;

public class Practices {

    private static void badPractice() {
        System.out.println("========Bad Practice========");
        double a = 1.0;
        double b = 0.1;

        System.out.println("Initial budget:" + a);
        System.out.println("Item price:" + b);
        System.out.println("Money left after buying 9 items:" + (a - b * 9));
    }

    private static void showgoodPracticeIntegers() {
        System.out.println("\n========Good Practice with Integers========");
        int budgetUsd = 100;
        int itemPriceUsd = 10;

        System.out.println("Initial budget (in cents):" + budgetUsd);
        System.out.println("Item price (in cents):" + itemPriceUsd);
        System.out.println("Money left after buying 9 items (in cents):" + (budgetUsd - itemPriceUsd * 9));
    }

    private static void showGoodPracticeBigDecimals() {
        System.out.println("\n========Good Practice with BigDecimals========");
        BigDecimal budgetUsd = new BigDecimal("1.0");
        BigDecimal itemPriceUsd = new BigDecimal("0.1");

        System.out.println("Initial budget:" + budgetUsd);
        System.out.println("Item price:" + itemPriceUsd);
        System.out.println(
                "Money left after buying 9 items:" + budgetUsd.subtract(itemPriceUsd.multiply(new BigDecimal("9"))));
    }

    public static void main(String[] args) {
        badPractice();
        showgoodPracticeIntegers();
        showGoodPracticeBigDecimals();
    }
}

public class PrimitiveSample {

    static int internalNumber;
    // static Integer internalNumber;

    public static void main(String[] args) {
        System.out.println("=======Bad Practice=======");
        showBadPracticeNulls();
        long startTime = System.currentTimeMillis();
        showBadPracticePerformance();
        System.out.println("Time spent in ms: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("\n=======Good Practice=======");
        showGoodPracticePerformance();
        System.out.println("Time spent in ms: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static void showBadPracticeNulls() {
        if (internalNumber == 108) {
            System.out.println("Internal number is 108");
        }
    }

    private static void showBadPracticePerformance() {
        Integer sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += 1;
        }
        System.out.println("Final number: " + sum);
    }

    private static void showGoodPracticePerformance() {
        int sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += 1;
        }
        System.out.println("Final number: " + sum);
    }
}

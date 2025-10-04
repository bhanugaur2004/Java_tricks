public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println("=======Bad Practice=======");
        long startTime = System.currentTimeMillis();
        badPractice();
        System.out.println("Time spent in ms: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("=========Good Practice=========");
        goodPractice();
        System.out.println("Time spent in ms: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static void badPractice() {
        String numericalSequence = "";
        for (int i = 0; i < 10_00; i++) {
            numericalSequence += i;
        }
        System.out.println(numericalSequence);
    }

    private static void goodPractice() {
        StringBuilder numericalSequence = new StringBuilder();
        for (int i = 0; i < 10_00; i++) {
            numericalSequence.append(i);
        }
        System.out.println(numericalSequence);
    }
}

import java.util.Random;
import java.util.UUID;

public class IdentifierSample {
    public static void main(String[] args) {
        showBadPractice();
        showGoodPractice();

    }

    private static void showBadPractice() {
        System.out.println("=======Bad Practice=======");
        long policyNumber = 456780532;
        int newBuisnessId = new Random().nextInt();
        System.out.println("For policy number " + policyNumber + " the new business id is " + newBuisnessId);

    }

    private static void showGoodPractice() {
        System.out.println("\n=======Good Practice=======");
        long policyNumber = 456780532;
        UUID newBusinessId = UUID.randomUUID();
        System.out.println("For policy number " + policyNumber + " the new business id is " + newBusinessId);

    }
}

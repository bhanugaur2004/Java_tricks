import java.math.BigDecimal;

public class Account {

    // Field: balance
    private BigDecimal balance;

    // 1. No-args constructor initializing balance to 0
    public Account() {
        this.balance = BigDecimal.ZERO;
    }

    // 2. deposit method
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    // 3. withdraw method
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    // 4. getBalanceString method
    public String getBalanceString() {
        // format to 2 decimal places
        return balance.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static void main(String[] args) {

        // Create account object
        Account acc = new Account();

        // Deposit money
        acc.deposit(new BigDecimal("100.50"));

        // Withdraw money
        acc.withdraw(new BigDecimal("40.25"));

        // Print balance as string
        System.out.println("Current Balance: " + acc.getBalanceString());
    }
}

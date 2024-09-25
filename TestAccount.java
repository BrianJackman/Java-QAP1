// TestAccount.java for qap 1
// By Brian Jackman
// 09/24/2024

public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account Acc1 = new Account("1", "Acc1", 5000);
        Account Acc2 = new Account("2", "Acc2", 4000);

        // Display balance of both accounts
        System.out.println("Balance of Acc1: $" + Acc1.getBalance());
        System.out.println("Balance of Acc2: $" + Acc2.getBalance());

        // Transfer $1000 from Acc1 to Acc2
        Acc1.transferTo(Acc2, 1000);

        // Display balance of both accounts again
        System.out.println("Balance of Acc1 after transfer: $" + Acc1.getBalance());
        System.out.println("Balance of Acc2 after transfer: $" + Acc2.getBalance());
    }
}
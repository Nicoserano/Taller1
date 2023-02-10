package logic;



/**
 *
 * @author Ronald Serramo
 */

public class BankAccount {
    private int accountNumber;
    private boolean activated = false;

    public BankAccount() {
        this.accountNumber= 54123;
        this.activated= true;
    }

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}

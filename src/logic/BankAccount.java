package logic;

/**

 Clase BankAccount que representa una cuenta bancaria.

 @author Ronald Serramo
 */
public class BankAccount {
    // Número de cuenta bancaria
    private int accountNumber;
    // Indica si la cuenta está activa o no
    private boolean activated = false;

    /**

     Constructor por defecto que establece el número de cuenta en 54123 y activa la cuenta.
     */
    public BankAccount() {
        this.accountNumber = 54123;
        this.activated = true;
    }
    /**

     Constructor que permite establecer el número de cuenta y si está activa o no.
     @param accountNumber número de cuenta
     @param activated indica si la cuenta está activa o no
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    /**

     Devuelve el número de cuenta.
     @return número de cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**

     Establece el número de cuenta.
     @param accountNumber número de cuenta
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**

     Indica si la cuenta está activa o no.
     @return verdadero si la cuenta está activa, falso en caso contrario
     */
    public boolean isActivated() {
        return activated;
    }
    /**

     Establece si la cuenta está activa o no.
     @param activated verdadero si se desea activar la cuenta, falso en caso contrario
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
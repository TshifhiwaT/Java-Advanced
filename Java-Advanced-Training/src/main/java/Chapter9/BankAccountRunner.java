package Chapter9;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount objAcc = new BankAccount("Jessica Jones", "9625887", AccountType.CHEQUE, 15000);

        System.out.print(objAcc.displayDetails());
    }
}

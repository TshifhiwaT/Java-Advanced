package Chapter9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount objAcc;

    @BeforeEach
    void setupAccount(){
        objAcc = new BankAccount("Jessica Jones", "9625887",AccountType.CHEQUE,15000);
    }

    @Test
    void testDeposit()  {
        //arrange
        double amountToDeposit = 600;
        double expectedBalance = 15600;

        //actual
        objAcc.deposit(amountToDeposit);
        double actualBalance = objAcc.getBalance();
        //Assert
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void testInvalidDeposit(){
        assertThrows(IllegalArgumentException.class, () ->objAcc.deposit(-500));
    }

    @Test
    void testWithdraw(){
        double amountToWithdraw = 1500;
        double expectedBalance = 13500;
        //actual
        try {
            objAcc.withdraw(amountToWithdraw);
            double actualBalance = objAcc.getBalance();
            assertEquals(expectedBalance, actualBalance);
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

    }

    @Test
    void testInvalidWithdrawalNegativeAmount(){
        assertThrows(IllegalArgumentException.class,
                () -> objAcc.withdraw(-100));
    }

    @Test
    void testWithdrawalInsufficientFunds(){
        double amountToWithdraw = objAcc.getBalance() + 1;
        assertThrows(InsufficientFundsException.class,
                () -> objAcc.withdraw(amountToWithdraw));
    }

    @Test
    void testGetAccountHolder(){
        System.out.println(objAcc.getAccountHolder());
    }

    @Test
    void testGetAccountNumber(){
        System.out.println(objAcc.getAccountNumber());
    }

    @Test
    void testSetAccountNumberDebit(){
        objAcc.setAccountType(AccountType.DEBIT);
        objAcc.setAccountNumber("9625887");
        String expected = "DB-9625887";
        assertEquals(expected, objAcc.getAccountNumber());
    }

    @Test
    void testSetAccountNumberSavings(){
        objAcc.setAccountType(AccountType.SAVINGS);
        objAcc.setAccountNumber("9625887");
        String expected = "SV-9625887";
        assertEquals(expected, objAcc.getAccountNumber());
    }

    @Test
    void testSetAccountNumberCredit(){
        objAcc.setAccountType(AccountType.CREDIT);
        objAcc.setAccountNumber("9625887");
        String expected = "CR-9625887";
        assertEquals(expected, objAcc.getAccountNumber());
    }

    @Test
    void testSetAccountNumberLoan(){
        objAcc.setAccountType(AccountType.LOAN);
        objAcc.setAccountNumber("9625887");
        String expected = "LN-9625887";
        assertEquals(expected, objAcc.getAccountNumber());
    }


    @AfterEach
    void getAccountDetails(){
        System.err.println(objAcc.displayDetails());
    }
}

package pkg2;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

// Parameterized
// When we need to run same class for multiple data set
// e.g. Create bank account for multiple set of test data
// Will be useful in data driven framework

// Need to annotate Junit class with @RunWith
@RunWith(Parameterized.class)
public class Demo200 {
    // below parameters needs to be used frequently
    private int nParamAccountId      = 0;
    private String sParamAccountName = "";
    private int nParamOpeningBalance = 0;

    // An object of this class will be created whenever a @Test will run
    public Demo200(int nAccountId, String sAccountName, int nOpeningBalance) {
        nParamAccountId      = nAccountId;
        sParamAccountName    = sAccountName;
        nParamOpeningBalance = nOpeningBalance;
    }

    // Need to have below method with annotation
    @Parameterized.Parameters
    public static Collection AccountDataSupplier() {
        // Need to return data as Collection
        return Arrays.asList(new Object[][] {
                { 22222,"Jon", 400}, // 1 set of data
                { 33333,"Mac", -90}, // 1 set of data
                { 44444,"Lucy",200}  // 1 set of data
        });
    }

    // below @Test method will run for every set of data passed from parameterized annotation
    @Test
    public void BankAccountCreationTester(){
        BankAccount oAcct          = new BankAccount();
        boolean bAddAccountResult = oAcct.AddBankAccount(nParamAccountId,
                                                         sParamAccountName,
                                                         nParamOpeningBalance);
        if(bAddAccountResult){
            System.out.println("Account created");
        }else{
            System.out.println("Account not created");
            Assert.fail();
        }
    }

    @Test
    public void NothingToDo(){
        System.out.println("NothingToDo");
    }


}


// Mandatory for all @Test methods to use annotated parameters
// All the @Test methods run for number of items/ rows in parameters Collection

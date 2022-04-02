import org.junit.Assert;
import org.junit.Test;

public class Demo02 {

    // real world example - testing piece of code

    @Test
    public void Demo02Scenario1(){
        BankAccount oAcct  = new BankAccount();
        boolean bHappyCase = oAcct.AddBankAccount(
                                   55555,
                                   "Jon",
                                   400);
        if(! bHappyCase){
            Assert.fail("Unable to open account case 1");
        }
        System.out.println("Able to open bank account case 1");

        boolean bUnHappyCase = oAcct.AddBankAccount(
                                     66666,
                                     "Sam",
                                     -5);
        if(! bUnHappyCase){
            Assert.fail("Unable to open account case 2");
        }

        System.out.println("Able to open bank account case 2");
    }


}

// Few Observations
// Multiple test running
// Each of the test is run independently from the other tests
// If any tests fails then others still continue to execute
// Junit Assertions
// Simple and little enhanced reporting in reports section in intellij/ eclipse
//     progress bar (green/ red),
//     full results, separate results for each test
//     rerun option

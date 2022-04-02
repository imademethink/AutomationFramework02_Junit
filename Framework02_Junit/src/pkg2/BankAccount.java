package pkg2;

public class BankAccount {

    public boolean AddBankAccount(int nAccountId, String sAccountName, int nOpeningBalance){

        System.out.print(Integer.toString(nAccountId) + " " + sAccountName + " " + nOpeningBalance);

        if (nAccountId < 9999 && nAccountId > 99999) return false;

        if (null == sAccountName) return false;

        if (nOpeningBalance < 0) return false;

        return true;
    }

}

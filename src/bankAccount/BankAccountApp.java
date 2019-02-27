package bankAccount;

import java.util.LinkedList;
import java.util.List;

/**
 * Paweł Tomasiewicz
 */

public class BankAccountApp
{
    public static void main(String[] args)
    {
        List<Account> accounts = new LinkedList<Account>();

        // Read a CSV File then create new accounts based on that data

        String file = "D:\\Program Files\\Java\\Workplace\\JavaProject\\src\\utilities\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = utilities.CSV.read(file);

        for(String[] accountHolder : newAccountHolder)
        {
            String name = accountHolder[0];
            String securityNr = accountHolder[1];
            String accountType = accountHolder[2];
            double initBox = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("SavingAccount"))
            {
                accounts.add(new SavingAccount(name,securityNr,initBox));
            }
            else if(accountType.equals("PersonalAccount"))
            {
                accounts.add(new PersonalAccount(name,securityNr,initBox));
            }
            else
                {
                System.out.println("Błąd");
            }
        }
        for(Account acc : accounts)
        {
            System.out.println("\n*******************\n");
            acc.showInfo();
        }
    }
}

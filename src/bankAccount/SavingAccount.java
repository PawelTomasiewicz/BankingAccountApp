package bankAccount;

public class SavingAccount extends Account
{
    // List properties specific to a SavingAccount

    int safetyBoxID;
    int safetyBoxKey;

    // Constructor to initialize settings for the SavingAccount properties

    public SavingAccount(String name, String securityNr, double initBox)
    {
        super(name, securityNr, initBox);
        accountNr = "1" + accountNr;
        setSaftyBox();
    }
    @Override
    public void setRate()
    {
        rate = getBaseRate() - .25;
    }

    private void setSaftyBox()
    {
        safetyBoxID = (int)(Math.random()* Math.pow(10,3));
        safetyBoxKey = (int)(Math.random()* Math.pow(10,4));
    }

    // Specific method dedicated to savingAccount

    public void showInfo()
    {
        super.showInfo();
        System.out.println("\nZabezpieczenie konta bankowego: " +
                "\nNr ID: " + safetyBoxID +
                "\nNr klucza do depozytu: " + safetyBoxKey);
    }
}

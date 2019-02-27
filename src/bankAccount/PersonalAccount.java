package bankAccount;

public class PersonalAccount extends Account
{
    // List properties specific to a PersonalAccount

    int debitCardNr;
    int debitCardPIN;

    // Constructor to initialize PersonalAccount properties

    public PersonalAccount(String name, String securityNr, double initBox)
    {
        super(name, securityNr, initBox);
        accountNr = "2" + accountNr;
        setDebitCard();
    }
    @Override
    public void setRate()
    {
       rate = getBaseRate()* .15;
    }

    //Specific methods dedicated to PersonalAccount

    private void setDebitCard()
    {
        debitCardNr = (int) (Math.random()* Math.pow(10,12));
        debitCardPIN = (int) (Math.random()* Math.pow(10,4));
    }

    public  void showInfo()
    {
        super.showInfo();
        System.out.println("\nZabezpieczenie karty debetowej: " +
                "\nNr karty debetowej: " + debitCardNr +
                "\nNr PIN: " + debitCardPIN);
    }
}

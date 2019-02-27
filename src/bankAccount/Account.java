package bankAccount;

public abstract class Account implements IBaseRate
{
    // List of properties for savingAccount and personalAccount

    private String name;
    private String securityNr;
    protected double balance;
    private static int index = 10000;
    protected String accountNr;
    protected double rate;

    // Constructor to set base properties and initialize the account

    public Account(String name, String securityNr, double initBox)
    {
        this.name = name;
        this.securityNr = securityNr;
        balance = initBox;

        // Set account number

        index++;
        this.accountNr = setAccountNr();
        setRate();
    }

    public abstract void setRate();
    private String setAccountNr()
    {
        String lastTwoSecurityNr = securityNr.substring(securityNr.length() - 2, securityNr.length());
        int uniqueID = index;
        int randomNr = (int) (Math.random()* Math.pow(10,3));
        return lastTwoSecurityNr + uniqueID + randomNr;
    }

    public void computing()
    {
        double accruidInterest = balance * (rate/100);
        balance = balance + accruidInterest;
        System.out.println("Naliczone odestki: " + accruidInterest + "zł");
        printBalance();
    }

    // List of methods

    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Wpłacana kwota: " + amount + "zł");
        printBalance();
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.println("Wypłacana kwota: " + amount + "zł");
        printBalance();
    }

    public void transfer(String toWhere, double amount)
    {
        balance = balance - amount;
        System.out.println("Kwota przelewu wynosi: " + amount + "zł" + "na konto: " + toWhere);
        printBalance();
    }

    public void printBalance()
    {
        System.out.println("Atkualny stan konta: " + balance + "zł");
    }

    public void showInfo()
    {
        System.out.println("* Imię i nazwisko: " + name + "\n* Nr konta: " + accountNr + "\n* Stan konta: " + balance + "zł" + "\n* Stawka: " + rate + "%");
    }
}

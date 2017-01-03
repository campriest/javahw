package files;



public class BankAccount{

    private double balance;

    public BankAccount(double startBalance){

        balance = startBalance;

    }

    public BankAccount(BankAccount otherAccount){

        balance = otherAccount.balance;

    }

    public String toString(){


        String amount = Double.toString(balance);

        return amount;
    }





}

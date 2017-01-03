import files.BankAccount;


public class BankAccountDriver{


    public static void main(String[] args){

        BankAccount checking = new BankAccount(2500);
        BankAccount saving = new BankAccount(checking);

        System.out.print(checking);
    }





}

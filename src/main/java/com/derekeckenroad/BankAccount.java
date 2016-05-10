package com.derekeckenroad;

/**
 * Created by derekeckenroad on 5/2/16.
 */
public class BankAccount {

    private double balance = 0;
    private double interest;
    private BankAccountType bankAccountType;
    private OverDraftProtection overDraftProtection;
    private String HolderName;
    private String AccountType;
    private Integer AccountNum;

    public BankAccount(String name, BankAccountType type , Integer number, OverDraftProtection odp) {
        HolderName = name;
        bankAccountType = type;
        AccountNum = number;
        overDraftProtection = odp;

    }

    public void addCredit(double x){
        balance += x;
        System.out.println("Transaction approved");
    }
    public void addDebit(double x){
        if(balance < 0){
            System.out.println("Transaction declined");
        }
        else {
            balance -= x;
            System.out.println("Transaction approved");
        }
    }
     public void chooseAccountType(){
         switch(bankAccountType){
             case CHECKING:
                 break;
             case SAVING:
                 interest = .5;
                 break;
             case INVESTMENT:
                 interest = .7;
                 break;
         }
     }
     public void OverDraftProtectionType() {
         switch (overDraftProtection) {
             case ENABLED:
                 break;
             case DISABLED:
                 break;
             case AUTOMATIC:
                 break;
         }
     }

}

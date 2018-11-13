/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
/**
 *
 * @author cl0831995
 */
public class Account {
     double balance;
     int transcount = 0;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
                if ( balance <= 0){
    System.out.println("Invalid balance");
    }
    }

    
  public void credit(double amount){ 
      balance = balance + amount;
      calculatefee();
  }  
public void debit(double amount){
    balance = balance - amount;
    if ( balance < amount){
        System.out.println("Debit amount exceeded account balance");
    }
}
    }
    


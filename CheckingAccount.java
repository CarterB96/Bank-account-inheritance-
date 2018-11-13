package account;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cl0831995
 */
public class CheckingAccount extends Account {
double transactionfee = 2;

public void calculatefee(){
    double thefee = getBalance() - transactionfee;
    debit(transactionfee);
 
}
}
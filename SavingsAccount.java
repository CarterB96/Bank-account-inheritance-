
package account;
// * To change this license header, choose License Headers in Project Properties.
//* To change this template file, choose Tools | Templates
 //* and open the template in the editor.
 //*//

/**
 *
 * @author cl0831995
 */
public class SavingsAccount extends Account{
final double interestRate;
public SavingsAccount(double rate){
    interestRate = rate;
}
public void calculateinterest(){
    double interest = getBalance() * interestRate / 100;
    credit(interest);
}
    }


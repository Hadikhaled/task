/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SystemOfBank;
import java.util.Scanner;
/**
 *
 * @author Hadi khaled
 */
public class SystemOfBank {

    
    public static void main(String[] args) {
       
         acount account = new acount();
        account.setAIRe(4.5);
        account.withDRAW(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
    
}

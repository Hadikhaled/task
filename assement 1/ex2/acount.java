/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemOfBank;

import java.util.Date;

/**
 *
 * @author Hadi khaled
 */
class acount {
   private int id =0;
   private  double balance = 0.0;
   private double annuaInterface =0.0 ;
private java.util.Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public acount() {
        dateCreated = new java.util.Date();
    }

    public acount(int id, double balance, double annuaInterface) {
        this.id = id;
        this.balance = balance;
        this.annuaInterface = annuaInterface;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuaInterface() {
        return annuaInterface;
    }

    public void setAnnuaInterface(double annuaInterface) {
        this.annuaInterface = annuaInterface;
    }
    public void setAIRe(double annualInterestRate) {
        this.annuaInterface = annualInterestRate;
    }
     public double getMIR() {
        return (annuaInterface / 100) / 12 ;
    }
    
     public double getMonthlyInterest() {
        return balance * getMIR();
    }

    public void withDRAW(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    
}

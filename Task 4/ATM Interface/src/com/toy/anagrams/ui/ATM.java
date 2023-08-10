/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toy.anagrams.ui;

/**
 *
 * @author User
 */
class ATM {
    private BankAccount account;
    private int pin;

    public ATM(BankAccount account,int pin) {
        this.account = account;
        this.pin = pin;
    }

    public double checkBalance() {
        return account.getBalance();
    }

    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }
    public int getPin() {
        return pin;
    }
    public void changePin(int pin){
        this.pin = pin;
    }
    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }
    
}
